/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickkai;
import java.util.Scanner;

public class QuickKAI {


    public static void main(String[] args) {
        
        Scanner I = new Scanner(System.in);
        int totalPrice1=0;
        int totalPrice2=0;
        int totalPrice3=0;
        
        System.out.println("<<<<Selamat datang di PT.KAI>>>>\n");
        System.out.print("Masukkan tanggal keberangkatan => ");
        String tk = I.nextLine();
        
        boolean ulang =true;
        while(ulang){
            System.out.print("Masukkan jumlah penumpang => ");
            int j = I.nextInt();
            
            String nama[]=new String[j];
            String no[]=new String[j];
            
            for(int a=0; a<nama.length; a++){
                System.out.print("Nama penumpang ke "+(a+1)+" : ");
                nama[a]= I.next();
            }
            for(int i=0; i<no.length; i++){
                System.out.print("No KTP penumpang ke "+(i+1)+" : ");
                no[i]= I.next();
            }
            
            System.out.println("\nTipe Kereta");
            System.out.println("1. Eksekutif");
            System.out.println("2. Bisnis");
            System.out.println("3. Ekonomi");
        
            System.out.print("Masukkan pilihan anda => ");
            int pilK = I.nextInt();
            
            switch(pilK){
                case 1:
                    System.out.println("\n======DAFTAR KEBERANGKATAN KERETA API======");
                    System.out.println("1. Malang-Semarang Rp.400000 (06.45-17.38)");
                    System.out.println("2. Malang-Bandung Rp.530000 (16.00-08.16)");
                    System.out.println("3. Surabaya-Jakarta Rp.580000 (14.01-01.34)");
                    System.out.println("4. Bandung-Banyuwangi Rp.510000 (08.40-20.54)");
                    System.out.println("5. Banyuwangi-Solo Balapan Rp.470000 (11.33-23.01)");
                    System.out.print("Masukkan pilihan anda => ");
                    int pil1 = I.nextInt();
                    switch(pil1){
                        case 1:
                            totalPrice1 += j*400000;
                            System.out.println("\n================================================");
                            System.out.println("                  PT.KAI");
                            System.out.println("================================================");
                            System.out.println("Kereta Pilihan\t= Malang-Semarang\nHarga\t\t= Rp.400000 \nDurasi\t\t= (06.45-17.38)");
                            System.out.println("Keberangkatan\t= "+tk+"\n"+"Penumpang\t= "+j+" ");
                            for(int i=0; i<nama.length;i++){
                                System.out.println("penumpang ke-"+(i+1)+"\nNama\t= "+nama[i]);
                                System.out.println("No KTP\t= "+no[i]);
                            }
                            break;
                        case 2:
                            totalPrice1 += j*530000;
                            System.out.println("\n================================================");
                            System.out.println("                  PT.KAI");
                            System.out.println("================================================");
                            System.out.println("Kereta Pilihan\t= Malang-Bandung\nHarga\t\t= Rp.530000 \nDurasi\t\t= (16.00-08.16)");
                            System.out.println("Keberangkatan\t= "+tk+"\n"+"Penumpang\t= "+j+" ");
                            for(int i=0; i<nama.length;i++){
                                System.out.println("penumpang ke-"+(i+1)+"\nNama\t= "+nama[i]);
                                System.out.println("No KTP\t= "+no[i]);
                            }
                            break;
                        case 3:
                            totalPrice1 += j*580000;
                            System.out.println("\n================================================");
                            System.out.println("                  PT.KAI");
                            System.out.println("================================================");
                            System.out.println("Kereta Pilihan\t= Surabaya-Jakarta\nHarga\t\t= Rp.580000 \nDurasi\t\t= (14.01-01.34)");
                            System.out.println("Keberangkatan\t= "+tk+"\n"+"Penumpang\t= "+j+" ");
                            for(int i=0; i<nama.length;i++){
                                System.out.println("penumpang ke-"+(i+1)+"\nNama\t= "+nama[i]);
                                System.out.println("No KTP\t= "+no[i]);
                            }
                            break;
                        case 4:
                            totalPrice1 += j*510000;
                            System.out.println("\n================================================");
                            System.out.println("                  PT.KAI");
                            System.out.println("================================================");
                            System.out.println("Kereta Pilihan\t= Bandung-Banyuwangi\nHarga\t\t= Rp.510000 \nDurasi\t\t= (08.40-20.54)");
                            System.out.println("Keberangkatan\t= "+tk+"\n"+"Penumpang\t= "+j+" ");
                            for(int i=0; i<nama.length;i++){
                                System.out.println("penumpang ke-"+(i+1)+"\nNama\t= "+nama[i]);
                                System.out.println("No KTP\t= "+no[i]);
                            }
                            break;
                        case 5:
                            totalPrice1 += j*470000;
                            System.out.println("\n================================================");
                            System.out.println("                  PT.KAI");
                            System.out.println("================================================");
                            System.out.println("Kereta Pilihan\t= Banyuwangi-Solo Balapan\nHarga\t\t= Rp.470000 \nDurasi\t\t= (11.33-23.01)");
                            System.out.println("Keberangkatan\t= "+tk+"\n"+"Penumpang\t= "+j+" ");
                            for(int i=0; i<nama.length;i++){
                                System.out.println("penumpang ke-"+(i+1)+"\nNama\t= "+nama[i]);
                                System.out.println("No KTP\t= "+no[i]);
                            }
                        default:
                            System.out.println("PILIHAN ANDA TIDAK TERSEDIA");
                    }
                    System.out.println("\nTotal pembayaran Rp."+totalPrice1);
        
                    System.out.print("Masukkan uang anda => ");
                    int bayar = I.nextInt();
                    if(bayar>totalPrice1){
                       System.out.println("Kembalian anda = "+ (bayar - totalPrice1)+"\nTerima Kasih\nSemoga Perjalanan Anda Menyenangkan");
                   }else if(bayar==totalPrice1){
                       System.out.println("Uang Anda Pas \nTerima Kasih\nSemoga Perjalanan Anda Menyenangkan");
                   }else{
                       System.out.println("Mohon maaf uang anda kurang "+ (totalPrice1-bayar));
                   }
                    break;
                case 2:
                    System.out.println("\n======DAFTAR KEBERANGKATAN KERETA API======");
                    System.out.println("1. Malang-Lempuyangan Rp.270000 (07.46-17.38)");
                    System.out.println("2. Malang-Solo balapan Rp.250000 (16.10-08.46)");
                    System.out.println("3. Solo Balapan-Bandung Rp.270000 (22.28-08.16)");
                    System.out.println("4. Banyuwangi-Malang Rp.225000 (08.39-15.16)");
                    System.out.print("Masukkan pilihan anda => ");
                    int pil2 = I.nextInt();
                    switch(pil2){
                        case 1:
                            totalPrice2 += j*270000;
                            System.out.println("\n================================================");
                            System.out.println("                   PT.KAI");
                            System.out.println("================================================");
                            System.out.println("Kereta Pilihan\t= Malang-Lempuyangan\nHarga\t\t= Rp.270000 \nDurasi\t\t= (07.46-17.38)");
                            System.out.println("Keberangkatan\t= "+tk+"\n"+"Penumpang\t= "+j+" ");
                            for(int i=0; i<nama.length;i++){
                                System.out.println("penumpang ke-"+(i+1)+"\nNama\t= "+nama[i]);
                                System.out.println("No KTP\t= "+no[i]);
                            }
                            break;
                        case 2:
                            totalPrice2 += j*250000;
                            System.out.println("\n================================================");
                            System.out.println("                   PT.KAI");
                            System.out.println("================================================");
                            System.out.println("Kereta Pilihan\t= Malang-Solo balapan\nHarga\t\t= Rp.250000 \nDurasi\t\t= (16.10-08.46)");
                            System.out.println("Keberangkatan\t= "+tk+"\n"+"Penumpang\t= "+j+" ");
                            for(int i=0; i<nama.length;i++){
                                System.out.println("penumpang ke-"+(i+1)+"\nNama\t= "+nama[i]);
                                System.out.println("No KTP\t= "+no[i]);
                            }
                            break;
                        case 3:
                            totalPrice2 += j*270000;
                            System.out.println("\n================================================");
                            System.out.println("                   PT.KAI");
                            System.out.println("================================================");
                            System.out.println("Kereta Pilihan\t= Solo Balapan-Bandung\nHargat\t= Rp.270000 \nDurasi\t\t= (22.28-08.16)");
                            System.out.println("Keberangkatan\t= "+tk+"\n"+"Penumpang\t= "+j+" ");
                            for(int i=0; i<nama.length;i++){
                                System.out.println("penumpang ke-"+(i+1)+"\nNama\t= "+nama[i]);
                                System.out.println("No KTP\t= "+no[i]);
                            }
                            break;
                        case 4:
                            totalPrice2 += j*225000;
                            System.out.println("\n================================================");
                            System.out.println("                   PT.KAI");
                            System.out.println("================================================");
                            System.out.println("Kereta Pilihan\t= Banyuwangi-Malang\nHarga\t\t= Rp.225000 \nDurasi\t\t= (08.39-15.16)");
                            System.out.println("Keberangkatan\t= "+tk+"\n"+"Penumpang\t= "+j+" ");
                            for(int i=0; i<nama.length;i++){
                                System.out.println("penumpang ke-"+(i+1)+"\nNama\t= "+nama[i]);
                                System.out.println("No KTP\t= "+no[i]);
                            }
                            break;
                        default:
                            System.out.println("PILIHAN ANDA TIDAK TERSEDIA");
                    }
                    System.out.println("\nTotal pembayaran Rp."+totalPrice2);
        
                    System.out.print("Masukkan uang anda => ");
                    int bayar2 = I.nextInt();
                    if(bayar2>totalPrice2){
                       System.out.println("Kembalian anda = "+ (bayar2 - totalPrice2)+"\nTerima Kasih\nSemoga Perjalanan Anda Menyenangkan");
                   }else if(bayar2==totalPrice2){
                       System.out.println("Uang Anda Pas \nTerima Kasih\nSemoga Perjalanan Anda Menyenangkan");
                   }else{
                       System.out.println("Mohon maaf uang anda kurang "+ (totalPrice2-bayar2));
                   }
                    break;
                case 3:
                    System.out.println("\n======DAFTAR KEBERANGKATAN KERETA API======");
                    System.out.println("1. Blitar-Surabaya Rp.15000 (17.25-22.38)");
                    System.out.println("2. Malang-Kertosono Rp.15000 (06.37-10.23)");
                    System.out.println("3. Malang-Surabaya Rp.15000 (12.46-16.23)");
                    System.out.println("4. Tulungagung-Malang Rp.15000 (13.25-17.02)");
                    System.out.println("5. Surabaya-Kertosono Rp.15000 (06.48-10.37)");
                    System.out.print("Masukkan pilihan anda => ");
                    int pil3 = I.nextInt();
                    switch(pil3){
                        case 1:
                            totalPrice3 += j*15000;
                            System.out.println("\n================================================");
                            System.out.println("                   PT.KAI");
                            System.out.println("Kereta Pilihan\t= Blitar-Surabaya\nHarga\t\t= Rp.15000 \nDurasi\t\t= (17.25-22.38)");
                            System.out.println("Keberangkatan\t= "+tk+"\n"+"Penumpang\t= "+j+" ");
                            for(int i=0; i<nama.length;i++){
                                System.out.println("penumpang ke-"+(i+1)+"\nNama\t= "+nama[i]);
                                System.out.println("No KTP\t= "+no[i]);
                            }
                            break;
                        case 2:
                            totalPrice3 += j*15000;
                            System.out.println("\n================================================");
                            System.out.println("                   PT.KAI");
                            System.out.println("================================================");
                            System.out.println("Kereta Pilihan\t= Malang-Kertosono\nHarga\t\t= Rp.15000 \nDurasi\t\t= (06.37-10.23)");
                            System.out.println("Keberangkatan\t= "+tk+"\n"+"Penumpang\t= "+j+" ");
                            for(int i=0; i<nama.length;i++){
                                System.out.println("penumpang ke-"+(i+1)+"\nNama\t= "+nama[i]);
                                System.out.println("No KTP\t= "+no[i]);
                            }
                            break;
                        case 3:
                            totalPrice3 += j*15000;
                            System.out.println("\n================================================");
                            System.out.println("                   PT.KAI");
                            System.out.println("================================================");
                            System.out.println("Kereta Pilihan\t= Malang-Surabaya\nHarga\t\t= Rp.15000 \nDurasi\t\t= (12.46-16.23)");
                            System.out.println("Keberangkatan\t= "+tk+"\n"+"Penumpang\t= "+j+" ");
                            for(int i=0; i<nama.length;i++){
                                System.out.println("penumpang ke-"+(i+1)+"\nNama\t= "+nama[i]);
                                System.out.println("No KTP\t= "+no[i]);
                            }
                            break;
                        case 4:
                            totalPrice3 += j*15000;
                            System.out.println("\n================================================");
                            System.out.println("                   PT.KAI");
                            System.out.println("================================================");
                            System.out.println("Kereta Pilihan\t= Tulungagung-Malang\nHarga\t\t= Rp.15000 \nDurasi\t\t= (13.25-17.02)");
                            System.out.println("Keberangkatan\t= "+tk+"\n"+"Penumpang\t= "+j+" ");
                            for(int i=0; i<nama.length;i++){
                                System.out.println("penumpang ke-"+(i+1)+"\nNama\t= "+nama[i]);
                                System.out.println("No KTP\t= "+no[i]);
                            }
                            break;
                        case 5:
                            totalPrice3 += j*15000;
                            System.out.println("\n================================================");
                            System.out.println("                   PT.KAI");
                            System.out.println("================================================");
                            System.out.println("Kereta Pilihan\t= Surabaya-Kertosono\nHarga\t\t= Rp.15000 \nDurasi\t\t= (06.48-10.37)");
                            System.out.println("Keberangkatan\t= "+tk+"\n"+"Penumpang\t= "+j+" ");
                            for(int i=0; i<nama.length;i++){
                                System.out.println("penumpang ke-"+(i+1)+"\nNama\t= "+nama[i]);
                                System.out.println("No KTP\t= "+no[i]);
                            }
                            break;
                        default:
                            System.out.println("PILIHAN ANDA TIDAK ADA");
                    }
                    System.out.println("\nTotal pembayaran Rp."+totalPrice3);
        
                    System.out.print("Masukkan uang anda => ");
                    int bayar3 = I.nextInt();
                    if(bayar3>totalPrice3){
                       System.out.println("Kembalian anda = "+ (bayar3 - totalPrice3)+"\nTerima Kasih\nSemoga Perjalanan Anda Menyenangkan");
                   }else if(bayar3==totalPrice3){
                       System.out.println("Uang Anda Pas \nTerima Kasih\nSemoga Perjalanan Anda Menyenangkan");
                   }else{
                       System.out.println("Mohon maaf uang anda kurang "+ (totalPrice3-bayar3));
                   }
                    break;
                default:
                    System.out.println("PILIHAN ANDA TIDAK ADA");
            }
            System.out.println("\nApakah ingin menambah pembelian ? (Ya/Tidak) ");
            String tanya = I.next();
            ulang = tanya.equalsIgnoreCase("Ya");
        }
        System.out.println("\nTERIMA KASIH SUDAH MENGGUNAKAN FASILITAS KAMI\n   JAGA KESEHATAN DAN TETAP JAGA JARAK");
    }
    
}
