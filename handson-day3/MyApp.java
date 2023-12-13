import java.util.Scanner;

public class MyApp{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Kompor powerKompor = new Kompor();
        Kompor tabungGas = new Kompor();

        System.out.println("===== Menyalakan Kompor dan TV =====");
        System.out.print("Ketikkan (on) untuk menyalakan: ");
        String inputPower = scanner.nextLine();
        powerKompor.setPower(inputPower);

        System.out.print("Pilih jenis tabung gas (3Kg/12Kg): ");
        Integer inputTabungGas = scanner.nextInt();
        tabungGas.setTabungGas(inputTabungGas);

        String hasilPowerKompor = powerKompor.getPower();
        Integer hasilTabungGas = tabungGas.getTabungGas();
        if (hasilPowerKompor.equals(inputPower)){
            System.out.println("Kompor dengan tabung gas " + hasilTabungGas + " Kg menyala");
        } else {
            System.out.println("Kompor dengan tabung gas " + hasilTabungGas + " Kg tidak menyala");
        }

        TV powerTV = new TV();
        TV channel = new TV();
        powerTV.setPower(inputPower);

        System.out.print("Pilih channel nomor: ");
        Integer inputNomorChannel = scanner.nextInt();
        channel.setChannel(inputNomorChannel);

        String hasilPowerTV = powerTV.getPower();
        Integer hasilChannel = channel.getChannel();
        if (hasilPowerTV.equals(inputPower)){
            System.out.println("TV menyala dengan channel nomor " + hasilChannel);
        } else {
            System.out.println("TV tidak menyala");
        }
    }
}