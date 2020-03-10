package ua.lviv.iot.office.equipment.model;

public class Printer extends AbstractOfficeEquipment {
  private TypeOfPrinter typeOfPrinter;

  public TypeOfPrinter getTypeOfPrinter() {
    return typeOfPrinter;
  }

  public void setTypeOfPrinter(TypeOfPrinter typeOfPrinter) {
    this.typeOfPrinter = typeOfPrinter;
  }

  public Printer(int productionYear, String producerName, double priceInUaH, String color,
                 double weightInKilograms, CableForPower cableForPower,
                 TypeOfPrinter typeOfPrinter) {
    super(productionYear, producerName, priceInUaH, color, weightInKilograms, cableForPower);
    this.typeOfPrinter = typeOfPrinter;
  }
}
