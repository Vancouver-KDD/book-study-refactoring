### This is an example post

```c++
  class Creator {
    public:
      virtual Product* CreateProduct() = 0;
  };

  template <class TheProduct>
  class StandardCreator: public Creator {
    public:
      virtual Product* CreateProduct();
  };

  template <class TheProduct>
  Product* StandardCreator<TheProduct>::CreateProduct() {
    return new TheProduct;
  }
```