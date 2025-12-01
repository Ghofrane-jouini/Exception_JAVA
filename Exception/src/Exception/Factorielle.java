package Exception;

class Factorielle{ 
    public static void main (String[] args){
        int i, nbEntiers = 0, factorielle = 1;
        int ancien;
        try {
            nbEntiers = Integer.parseInt(args[0]);     
            if(nbEntiers >= 20){
                throw new EntierSupException();
            }
            if(nbEntiers<0){
                throw new EntierNegativeExcetpion();
            }
            for (i = 2; i <= nbEntiers; i++){
                ancien = factorielle;
                factorielle *= i;
            }
            System.out.println(" Voila la factorielle des " + nbEntiers + " premiers entiers : " + factorielle);
                    
        }catch (EntierNegativeExcetpion e) {

            System.out.println(e.getMessage());

        } catch (EntierSupException e) {

            System.out.println(e.getMessage());

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {

            if (e instanceof ArrayIndexOutOfBoundsException)

                System.out.println("donner un parametre de factorielle");

            else if (e instanceof NumberFormatException)

                System.out.println("doit etre entier");



        }
    }
}