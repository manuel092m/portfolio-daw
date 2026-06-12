import java.util.ArrayList;

public class TelefonoMovil {
    private String myNumber;
    private ArrayList<Contacto> myContacts;

    public TelefonoMovil(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contacto c){
        for (int i = 0; i<myContacts.size(); i++){
            if (myContacts.get(i).getName().equals(c.getName())){
                return false;
            }
        }
        myContacts.add(c);
        return true;
    }

    public boolean updateContact(Contacto oldContact, Contacto newContact) {

        int posicion = -1;


        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(oldContact.getName())) {
                posicion = i;
                break;
            }
        }


        if (posicion == -1) {
            return false;
        }


        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(newContact.getName())
                    && i != posicion) {
                return false;
            }
        }


        myContacts.set(posicion, newContact);
        return true;
    }

    public boolean removeContact(Contacto c) {

        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(c.getName())) {
                myContacts.remove(i);
                return true;
            }
        }

        return false;
    }

    public int findContact(Contacto c) {

        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(c.getName())) {
                return i;
            }
        }

        return -1;
    }

    public Contacto queryContact(String name) {

        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return myContacts.get(i);
            }
        }

        return null;
    }

    public void printContacts() {

        System.out.println("Lista de contactos:");

        for (int i = 0; i < myContacts.size(); i++) {
            Contacto c = myContacts.get(i);
            System.out.println((i + 1) + ". " + c.getName() + " -> " + c.getPhoneNumber());
        }
    }

}


