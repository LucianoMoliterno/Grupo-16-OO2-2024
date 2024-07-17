package com.unla.stocksystem.helpers;

public class ViewRouteHelper {
	/**** Views ****/
	// HOME
	public final static String INDEX = "home/index";
	public final static String HELLO = "home/hello";

	// USER
	public final static String USER_LOGIN = "user/login";
	public final static String USER_LOGOUT = "user/logout";

	// PRODUCTO
	public final static String PRODUCTO = "product/index";
	public final static String PRODUCTO_NEW = "product/new";
	public final static String PRODUCTO_UPDATE = "product/update";

	/**** Redirects ****/
	public final static String ROUTE = "/index";
	public final static String PRODUCTO_ROOT = "/product";
	public final static String CARRITO_ROOT = "/carrito";
	public final static String LOTE_ROOT = "/lote";
	public final static String APROV_ROOT = "/pedidosAprov";

	// LOTE
	public final static String LOTE = "lote/index";

	public final static String LOTE_UPDATE = "lote/update";
	public final static String INFORME = "lote/informe";

	// APROVISIONAMIENTO
	public final static String APROV = "pedidosAprov/index";
	public final static String APROV_NEW = "pedidosAprov/new";
	public final static String APROV_UPDATE = "pedidosAprov/update";

	// REPORTES STOCK
	public final static String STOCK = "stock/index";

	// CARRITO
	public final static String CARRITO = "carrito/index";

	// NOT_ADMIN
	public final static String NOT_ADMIN = "not_admin/index";

}
