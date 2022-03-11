public class Inimene {
        String FirstName;
        String LastName;
        int age;


        public Inimene(int age, String FirstName, String LastName){
            this.age = age;
            this.FirstName = FirstName;
            this.LastName = LastName;

        }

        public String InimeneOutput(){
            return (FirstName + " " + LastName + " " + age);

        }

    }
