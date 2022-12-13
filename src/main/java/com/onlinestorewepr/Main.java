package com.onlinestorewepr;

import com.onlinestorewepr.dao.CartItemDAO;
import com.onlinestorewepr.dao.ProductDAO;
import com.onlinestorewepr.dao.UserDAO;
import com.onlinestorewepr.entity.Cart;
import com.onlinestorewepr.entity.CartItem;
import com.onlinestorewepr.entity.User;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    User user = new UserDAO().get("admin");
    if (user == null) {
      user = new User("admin", "admin", true, "Admin");
      new UserDAO().insert(user);
    }

    System.out.println("Username: " + user.getName());
  }
}