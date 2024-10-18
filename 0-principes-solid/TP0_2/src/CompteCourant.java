public class CompteCourant extends Compte {
    public CompteCourant(String id, String dateCreation) {
        super(id, dateCreation);
    }

    @Override
    public boolean addOperation(Operation operation) {
        if(operation.getTypeOperation() == TypeOperation.Debit){
                this.operations.add(operation);
                this.montant += operation.getMontant();
                return true;
            }
            else{
                if(this.montant >= operation.getMontant()){
                    this.operations.add(operation);
                    this.montant -= operation.getMontant();
                   return true;
                }
                return false;
            }
    }
}
