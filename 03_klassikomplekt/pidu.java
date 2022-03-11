public class pidu {
        String status;
        boolean regatud;

        public pidu(String Inimene, String status, boolean regatud){
            this.status = status;
            this.regatud = regatud;

            if (regatud){
                switch (status){
                    case "makstud":
                        System.out.println(Inimene + " pileti eest tasutud, näeme peol!");
                        break;
                }
            }else{
                System.out.println(Inimene + " - Palun tasuge pileti eest !");
            }

        }

    }

