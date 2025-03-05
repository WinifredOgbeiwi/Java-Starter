package week2;

import java.text.MessageFormat;

public class WeightOnMars {
   static float marsWeightOgbeiwi;
   static float gravityonMars = 0.38f;
    public static void main(String[] args) {
        CalculateMarsWeight(70.0f);
    }
    public static void CalculateMarsWeight(float earthWeightOgbeiwi){
        marsWeightOgbeiwi = earthWeightOgbeiwi * gravityonMars;
//        initial result
        System.out.println(MessageFormat.format("{0}Kg on Earth is {1}Kg on Mars", earthWeightOgbeiwi, marsWeightOgbeiwi));

        double marsWeightDoubleType = marsWeightOgbeiwi;
        System.out.println(MessageFormat.format("Mars weight after converting to double is {0}Kg",marsWeightDoubleType));

        double marsWeightDoubleTypeLimit = marsWeightOgbeiwi;
        System.out.println(MessageFormat.format("Mars weight after converting to double and limiting to 4 digits {0}Kg", String.format("%.4f", marsWeightDoubleTypeLimit)));

        int marsWeightIntType = (int)marsWeightOgbeiwi;
        System.out.println(MessageFormat.format("Mars weight after converting to int is {0}Kg",marsWeightIntType));

//        returns an ACSII Character
        char marsWeightCharType = (char)marsWeightIntType;
        System.out.println(MessageFormat.format("Mars weight after converting to char is {0}Kg",marsWeightCharType ));

        int mathOperation = marsWeightCharType + 20;
        System.out.println(MessageFormat.format("Math Operation on char type result = {0}",mathOperation));
    }
}
