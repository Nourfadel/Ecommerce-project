# 🛒 Fawry E-Commerce System – Internship Challenge

This project is a solution for the **Fawry Quantum Internship Challenge (2025)**.  
It simulates a mini e-commerce system using core **Java OOP principles** with features like product handling, shipping, cart management, and checkout.

---

## 📦 Features

- ✅ Define products with:
    - Name, price, quantity
    - Optional: expiry date, shipping weight

- ✅ Product Types:
    - Expirable only (e.g. Biscuits)
    - Shippable only (e.g. TV)
    - Both expirable and shippable (e.g. Cheese)
    - Digital (e.g. Scratch Cards)

- ✅ Cart system:
    - Add product with quantity validation
    - Prevent adding expired or over-quantity items

- ✅ Checkout system:
    - Subtotal calculation
    - Shipping fee calculation (flat 30 if any item is shippable)
    - Error handling (empty cart, out of stock, expired, insufficient balance)
    - Customer balance update
    - Simulated shipping output

---

## 🧱 Project Structure

| Class/File                       | Description |
|----------------------------------|-------------|
| `Product.java`                   | Base class with name, price, quantity |
| `ExpirableProduct.java`          | Adds expiry date check |
| `ShippableProduct.java`          | Adds weight, implements `Shippable` |
| `ExpirableShippableProduct.java` | Combines both expiry + shipping |
| `Cart.java`                      | Add/remove products, compute subtotal & shippables |
| `Customer.java`                  | Checkout logic, balance update |
| `Shopping.java`                  | Simulates shipping and weight summary |
| `Main.java`                      | Demonstrates full flow with sample data |

---

## 🧪 Sample Output

** Shipment notice **
2x Cheese
1x Biscuits
400g
400g
700g
Total package weight 1.5kg

** Checkout receipt **
2x Cheese
200
1x Biscuits
150
1x ScratchCard
50
Subtotal 400
Shipping 30
Amount 430
Customer Balance 570
END.


---

## 🚀 How to Run

> This is a **Java Maven** project. You can run it using IntelliJ or NetBeans.

### 💻 In IntelliJ or NetBeans:
- Open the project
- Right-click `Main.java` → **Run**

### 🔧 Or via terminal (if Maven installed):

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.mycompany.ecommerce.Main"
