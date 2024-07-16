document.addEventListener("DOMContentLoaded", () => {
	const CartManager = {
		init() {
			this.bindEvents();
		},

		bindEvents() {
			const addButtons = document.querySelectorAll(".boton-item");
			addButtons.forEach(button => button.addEventListener("click", this.addToCart.bind(this)));
		},

		async addToCart(event) {
			const button = event.currentTarget;
			const productId = button.dataset.productoId;
			const quantityInput = button.previousElementSibling;
			const quantity = quantityInput.value;

			try {
				const response = await this.sendAddToCartRequest(productId, quantity);
				console.log('Producto agregado:', response);
				await this.updateCart();
			} catch (error) {
				console.error('Error al agregar el producto:', error);
				// Aquí podrías mostrar un mensaje de error al usuario
			}
		},

		async sendAddToCartRequest(productId, quantity) {
			const response = await fetch('/carrito/agregar', {
				method: 'POST',
				headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
				body: new URLSearchParams({ productoId: productId, cantidad: quantity })
			});

			if (!response.ok) {
				throw new Error('Respuesta de red no fue ok');
			}

			return response.text();
		},

		async updateCart() {
			try {
				const response = await fetch('/carrito');
				const html = await response.text();
				const parser = new DOMParser();
				const doc = parser.parseFromString(html, 'text/html');
				const cartItems = doc.querySelector('.carrito-items').innerHTML;
				document.querySelector('.carrito-items').innerHTML = cartItems;
				this.updateCartTotal();
			} catch (error) {
				console.error('Error al actualizar el carrito:', error);
				// Aquí podrías mostrar un mensaje de error al usuario
			}
		},

		updateCartTotal() {
			const cartItems = document.querySelectorAll(".carrito-item");
			const total = Array.from(cartItems).reduce((sum, item) => {
				const price = parseFloat(item.querySelector(".carrito-item-precio").textContent.replace("$", ""));
				const quantity = parseInt(item.querySelector(".carrito-item-cantidad").textContent);
				return sum + price * quantity;
			}, 0);

			document.querySelector(".carrito-precio-total").textContent = `$${total.toFixed(2)}`;
		}
	};

	CartManager.init();
});