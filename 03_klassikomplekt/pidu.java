public class pidu {
        String status;
        boolean regatud;

        public pidu(Inimene inimene, String status, boolean regatud){
            this.status = status;
            this.regatud = regatud;

            if (regatud){
                switch (status){
                    case "makstud":
                        System.out.println(inimene.FirstName + " pileti eest tasutud, näeme peol!");
                        break;
                }
            }else{
                System.out.println(inimene.FirstName + " - Palun tasuge pileti eest !");
            }

        }

    }

