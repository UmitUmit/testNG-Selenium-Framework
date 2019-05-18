package com.weborders.utilities;

import com.weborders.pages.LoginPage;
import com.weborders.pages.OrderPage;
import com.weborders.pages.ViewAllOrdersPage;
import com.weborders.pages.ViewAllProductsPage;

public class Pages {
    private LoginPage loginPage;
    private ViewAllOrdersPage viewAllOrdersPage;
    private ViewAllProductsPage viewAllProductsPage;
    private OrderPage orderPage;

    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public ViewAllOrdersPage viewAllOrders() {
        if (viewAllOrdersPage == null) {
            viewAllOrdersPage = new ViewAllOrdersPage();
        }
        return viewAllOrdersPage;
    }

    public ViewAllProductsPage viewAllProducts() {
        if (viewAllProductsPage == null) {
            viewAllProductsPage = new ViewAllProductsPage();
        }
        return viewAllProductsPage;
    }

    public OrderPage order() {
        if (orderPage == null) {
            orderPage = new OrderPage();
        }
        return orderPage;
    }
}
