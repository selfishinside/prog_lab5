package managers.Command;

import Collections.Vehicle;
import exceptions.NoArgumentException;
import exceptions.NoElementException;
import exceptions.WrongArgumentException;
import managers.CollectionManager;

import java.util.HashSet;

/**
 * Данная команда выводит колличество элементов с указанным типом топлива
 * @see BaseCommand
 * @since 1.0
 */
public class CountByFuelTypeCommand implements BaseCommand{
    @Override
    public void execute(String[] args) throws Exception{
        CollectionManager collectionManager = CollectionManager.getInstance();
        if (args.length > 2) {
            throw new WrongArgumentException(args[2]);
        }
        if (args.length < 2) {
            throw new NoArgumentException("fueltype ( KEROSENE, MANPOWER, NUCLEAR )");
        }
        HashSet<Vehicle> vehicleCollection = collectionManager.getVehicleCollection();
        String enterFuelType = args[1];
        int counter = 0;
        for (Vehicle vehicle : vehicleCollection) {
            if(vehicle.getFuelType().toString().equalsIgnoreCase(enterFuelType)) {
                counter += 1;
            }
        }
        System.out.println("Coincidences: " + counter);
    }

    @Override
    public String getName() {
        return "countByFuelType fuelType: ";
    }

    @Override
    public String getDescription() {
        return "number of elements that match by FuelType";
    }
}
