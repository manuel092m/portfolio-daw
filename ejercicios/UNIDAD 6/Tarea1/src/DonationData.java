import java.util.ArrayList;

public class DonationData {

    private ArrayList<Donation> donations;

    public void donationDataInit(){
        donations = new ArrayList<>();
    }

    public Donation donationParse(String text){

        String[] parts = text.split(";");

        if (parts.length != 5) {
            System.out.println("Formato incorrecto");
            return null;
        }

        String date = parts[0];
        String document = parts[1];
        String ngo = parts[2];
        String projectCode = parts[3];
        double amount = Double.parseDouble(parts[4]);

        return new Donation(date, document, ngo, projectCode, amount);
    }

    public void donationDataAdd(Donation donation) {


        for (int i = 0; i < donations.size(); i++) {
            Donation d = donations.get(i);

            if (d.getDate().equals(donation.getDate())
                    && d.getDocument().equals(donation.getDocument())
                    && d.getProjectCode().equals(donation.getProjectCode())) {
                return;
            }
        }


        int position = 0;

        while (position < donations.size()
                && donations.get(position).getProjectCode().compareTo(donation.getProjectCode()) < 0) {
            position++;
        }


        donations.add(position, donation);
    }

    public String donationDataGet(int position){

        if (position>=0 && position < donations.size()) {
            return  donations.get(position).toString();
        }else {

        return "No existe donacion en esa posición";}
    }

    public void donationDataDel(String date, String document, String projectCode) {

        for (int i = 0; i < donations.size(); i++) {
            Donation d = donations.get(i);

            if (d.getDate().equals(date)
                    && d.getDocument().equals(document)
                    && d.getProjectCode().equals(projectCode)) {

                donations.remove(i);
                return;
            }
        }
    }

    public void printAll(){
        for (int i = 0; i< donations.size(); i++){
            System.out.println(donations.get(i));
        }
    }


}
