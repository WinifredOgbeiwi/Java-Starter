package week2;

import java.text.MessageFormat;

public class BlocksneedContainer {
    public static void main(String[] args) {
        int amountOfBricks = 57;
        int  ContainerCapacity = 8;

        int fullContainer = amountOfBricks /ContainerCapacity;
        System.out.println(MessageFormat.format("We have {0} full containers",fullContainer));

        int containers = fullContainer +(amountOfBricks % ContainerCapacity);
        System.out.println(MessageFormat.format("We have {0} containers in general (Full and not full)",containers));

        int notFullContainer = amountOfBricks % ContainerCapacity;
        System.out.println(MessageFormat.format("We have {0} not full containers",notFullContainer));



    }
}
