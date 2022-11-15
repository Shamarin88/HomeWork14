 public class Car {
    public String brand;
    public double engineVolume;
    public String color;
    public int productionYear;
    public String productionCountry;
    public Car(String brand, int productionYear, String productionCountry, String color, double engineVolume) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
    }
     @Override
     public String toString() {
         return "Автомобиль - " + brand + "\nГод выпуска - " + productionYear + "\nСтрана производитель - " + productionCountry + "\nЦвет - " + color + "\nОбъем двигателя - " + engineVolume;
     }
 }
