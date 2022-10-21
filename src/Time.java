public class Time {
        private int hours;
        private int min;
        private int seconds;

        public Time(int hours, int min, int seconds){
            this.hours = hours;
            this.min = min;
            this.seconds = seconds;

        }

        public void timeCheck(int hours, int min, int seconds){
            if(hours <= 24 && hours >= 0){
                if(min <= 60 && min >= 0){
                    if(seconds <= 60 && seconds >= 0){
                        display(hours, min, seconds);
                    }else {
                        System.out.println("Inputted invalid seconds");
                    }

                }else {
                    System.out.println("Inputted invalid min");
                }
            }else {
                System.out.println("Invalid hours inputted");
            }
        }

        public void display(int hours, int min, int seconds){
            if(hours > 12 ){
                int pmHour = hours - 12;
                System.out.println("Time is: " + pmHour + ":" + min + ":" + seconds + " PM");
            }else {
                System.out.println("Time is: " + hours + ":" + min + ":" + seconds + " AM");
            }
        }
    }

