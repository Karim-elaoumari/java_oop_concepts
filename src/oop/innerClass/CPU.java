package oop.innerClass;

public  class CPU {
    double price;

    public  static class Processor{
        public static class ROM{
            public double getRomStorage(){
                return 526;
            }
        }
         double cores;
        String manufacturer;
       public  double getCache(){
            return 4.3;
        }
    }
    public class RAM{
        double memory;
        String manufacturer;

        public double getClockSpeed(){
            return 5.5;
        }
    }


}
