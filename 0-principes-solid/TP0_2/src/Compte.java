
import java.util.ArrayList;

public abstract class Compte {
    protected ArrayList<Operation> operations;
    protected String id;
    protected String dateCreation;
    protected double montant;

    public Compte(String id, String dateCreation) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.operations = new ArrayList<>();
        this.montant = 0;
    }

    //    public boolean addOperation(Operation operation){
//        if(this.typeCompte == TypeCompte.Courant){
//            if(operation.getTypeOperation() == TypeOperation.Debit){
//                this.operations.add(operation);
//                this.montant+= operation.getMontant();
//                return true;
//            }
//            else{
//                if(this.montant >= operation.getMontant()){
//                    this.operations.add(operation);
//                    this.montant-= operation.getMontant();
//                   return true;
//                }
//                return false;
//            }
//        }
//        else{
//            if(operation.getTypeOperation() == TypeOperation.Debit){
//                this.operations.add(operation);
//                this.montant+= operation.getMontant()*0.05;
//                return true;
//            }
//            else{
//                if(this.montant >= operation.getMontant()*0.1 &&
//                        java.time.LocalDate.now().getYear() > Integer.parseInt(this.dateCreation.split("/")[2]))
//                {
//                    this.operations.add(operation);
//                    this.montant-= operation.getMontant()*0.1;
//                    return true;
//                }
//                return false;
//            }
//        }
//
//    }
    public abstract boolean addOperation(Operation operation);

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
