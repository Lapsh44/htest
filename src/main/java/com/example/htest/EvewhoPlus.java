//package com.example.htest;
//
///*// порядок действий:
// * копируем данные с файла evewho  в файл evewho1
// * удаляем evewho
// * запускаем
// *копируем данные с evewho2 в evewho1
// * чекаем файл на отправку
// *
// * */
//
////import org.jetbrains.annotations.NotNull;
//
//
//import java.io.*;
//import java.net.HttpURLConnection;
//import java.net.URI;
//import java.net.URL;
//import java.nio.charset.Charset;
//import java.nio.file.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class EvewhoPlus {
//
//    public static void main(String[] args) throws Exception {
//        evewhosend();
//    }
//
//    public static void evewhosend() throws Exception {
//
//        //  getNumbers(99008879);
//        List<String> evewho0 = new ArrayList<>();
//        List<Integer> AlyArrayList = new ArrayList<>();
//        // AlyArrayList.add(99008879); // Russian Academy Alliance
//        AlyArrayList.add(1220922756); // Red Alliance
//        AlyArrayList.add(1411711376); // Legion of xXDEATHXx
//        AlyArrayList.add(99008469); //  UNREAL Alliance
//        AlyArrayList.add(99007203); // Siberian Squads
//        AlyArrayList.add(99002003); // No Value
//        AlyArrayList.add(99005518); // MIDAS 22
//        AlyArrayList.add(99004804); // DarkSide.
//        AlyArrayList.add(99004136); // Dangerous Voltage
//        AlyArrayList.add(1614483120); // Bright Side of Death
//        AlyArrayList.add(99004734); // Dragon Empire.
//        AlyArrayList.add(99001648); // P-A-T-R-I-O-T-S
//        AlyArrayList.add(99006756); // Da Imbalance
//        AlyArrayList.add(99005360); // Prothean Alliance
//        AlyArrayList.add(99008656); // Quote Alliance
//        AlyArrayList.add(99003557); // LowSechnaya Sholupen
//        AlyArrayList.add(99002584); //  Smile 'n' Wave
//        AlyArrayList.add(99006784); //  Real Enemy of Angel Cartel
//        AlyArrayList.add(99007969); //  THE RUSSIA
//        AlyArrayList.add(99009712); //  X-Empire
//
//        List<Integer> CorpArrayList = new ArrayList<>();
//
//        CorpArrayList.add(98575483); //  000 Russian Academy 000
//        CorpArrayList.add(98324027); //  Academy of space-corporation Keepers of Truth
//        CorpArrayList.add(98536418); //  Academy of Russian Federation
//        CorpArrayList.add(98627389); //    Alpha Academic
//        CorpArrayList.add(98605852); //  Arctic Beans
//        CorpArrayList.add(98351789); //   achtung partizanen
//        CorpArrayList.add(98502864); // Cheeki Breeki Syndicate
//        CorpArrayList.add(98442007); //   Citadel nazgul
//        CorpArrayList.add(98129384); // Duckling System
//        CorpArrayList.add(98279775); // Deep Space Conquerors
//        CorpArrayList.add(98444100); // IX Liber Imperatorius Legio
//        CorpArrayList.add(98431483); //  	Inner Hell
//        CorpArrayList.add(98592414); //  	Eye of Inferno
//        CorpArrayList.add(98577736); //  	HI-sec Training Center
//        CorpArrayList.add(98212445); //  Highway to Heaven
//        CorpArrayList.add(244898283); //  OEG Goon
//        //   CorpArrayList.add(98532631); //  Mining Expeditionary Force
//        CorpArrayList.add(98633032); //   	Messiah.
//        CorpArrayList.add(98366055); //     Ministry of Offense  Goon
//        CorpArrayList.add(98085082); //  Rezeda Core
//        CorpArrayList.add(1613511511);// Russian ICE Bears Goon
//        CorpArrayList.add(98408597); //  rRED ANTS Goon
//        CorpArrayList.add(98032504); //  Sequent Industry Test
//        CorpArrayList.add(98322690); //  Space Traffic Control
//        CorpArrayList.add(98403073); //  S0viet Uni0n Test
//        CorpArrayList.add(98605189); //  X-Academy
//        CorpArrayList.add(98603207); //  Zero To High
//        CorpArrayList.add(866918391); // X-Zest Voyage
//        CorpArrayList.add(98607509); //  X-Fight Club
//        CorpArrayList.add(98515207); //  XAOS RELOADED Test
//        CorpArrayList.add(98383139); //  Weyland-Yutani deep mining expedition
//
//
//        File source = new File("E:\\evewho.txt");
//        File dest = new File("E:\\evewho1.txt");
//        Path sourcePath = source.toPath();
//        Path destPath = dest.toPath();
//        try {
//            Files.copy(sourcePath, destPath, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            Files.deleteIfExists(Paths.get(String.valueOf(sourcePath)));
//        } catch (NoSuchFileException e) {
//            System.out.println("No such file/directory exists");
//        } catch (DirectoryNotEmptyException e) {
//            System.out.println("Directory is not empty.");
//        } catch (IOException e) {
//            System.out.println("Invalid permissions.");
//        }
//
//        System.out.println("Deletion successful.");
//
//
//        for (int k = 0; k < AlyArrayList.size(); k++) {
//            evewho0 = getNumbers(AlyArrayList.get(k), "allilist/");
//
//
//            for (int i = 0; i < evewho0.size(); i++) {
//                //
//                try {
//                    OutputStreamWriter osw = new OutputStreamWriter(
//                            new FileOutputStream("E:\\evewho.txt", true),
//                            Charset.forName("UTF-8"));
//                    osw.write(evewho0.get(i) + "\r\n");
//                    osw.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        for (int l = 0; l < CorpArrayList.size(); l++) {
//            evewho0 = getNumbers(CorpArrayList.get(l), "corplist/");
//
//
//            for (int m = 0; m < evewho0.size(); m++) {
//                //
//                try {
//                    OutputStreamWriter osw = new OutputStreamWriter(
//                            new FileOutputStream("E:\\evewho.txt", true),
//                            Charset.forName("UTF-8"));
//                    osw.write(evewho0.get(m) + "\r\n");
//                    osw.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        //   List evewho1 = getNumbers(99008879);
//        List<String> evewho1 = new ArrayList<>();
//        //    List evewho1 = new ArrayList();
//        try {
//            //старая выгрузка
//            String path = "E:\\evewho1.txt";
//            BufferedReader br = new BufferedReader(new FileReader(path));
//            String sCurrentLine;
//            while ((sCurrentLine = br.readLine()) != null) {
//                evewho1.add(sCurrentLine);
//                //  all.add("\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("прошлый " + evewho1.size() + evewho1);
//
//
//        File source2 = new File("E:\\evewho.txt");
//        File dest2 = new File("E:\\evewho2.txt");
//        Path sourcePath2 = source2.toPath();
//        Path destPath2 = dest2.toPath();
//        try {
//            Files.copy(sourcePath2, destPath2, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        List<String> evewho2 = new ArrayList<>();
//
//        try {
//            String path = "E:\\evewho2.txt";
//            BufferedReader br = new BufferedReader(new FileReader(path));
//            String sCurrentLine;
//            while ((sCurrentLine = br.readLine()) != null) {
//                evewho2.add(sCurrentLine);
//                //  all.add("\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //   List <String>  evewho2 = new ArrayList<>(evewho1);
//        //новая выгрузка
//        System.out.println("текущий" + evewho2.size() + evewho2);
//
//
//        evewho1.removeAll(evewho2);
//
//        System.out.println(evewho1);
//        //   System.out.println(evewho2);
//
//
//        for (int i = 0; i < evewho1.size(); i++) {
//            try {
//
//
//                GetInfo getInfo = new GetInfo();
//                String baseUrl = "https://esi.evetech.net/latest";
//                String esiMethod = "characters";
//                String id = evewho1.get(i);
//                String queryArg = "?datasource=tranquility";
//                String requestMethod = "GET";
//
//                final String regex = "name\\\":\\\"([a-zA-Z0-9 ]+)";
//                final String string = getInfo.minfo(baseUrl, esiMethod, id, queryArg, requestMethod);
//                final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
//                final Matcher matcher = pattern.matcher(string);
//
//                while (matcher.find()) {
//                    //      System.out.println("Full match: " + matcher.group(0));
//                    for (int j = 1; j <= matcher.groupCount(); j++) {
//                        // System.out.println(matcher.group(j));
//                        String charName = matcher.group(j);
//                        try {
//                            OutputStreamWriter osw = new OutputStreamWriter(
//                                    //   new FileOutputStream("E:\\evewhoTOsend.txt",true),
//                                    new FileOutputStream("E:\\npc.txt", true),
//                                    Charset.forName("UTF-8"));
//                            osw.write(charName + "\r\n");
//                            osw.close();
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//
//
//                    }
//                }
//            } catch (HttpException502 e) {
//
//                System.out.print(" <-- CharacterBlockExeption " + e.fillInStackTrace());
//            } catch (HttpException504 e) {
//
//                System.out.print(" <-- 504 for URL Exeption " + e.fillInStackTrace());
//            }
//
//
//        }
//
//        sending();
//
//    }
//
//
//    public static ArrayList getNumbers(int charCorp, String corpaly) throws Exception {
//
//        String baseUrl = "https://evewho.com/api/" +
//                //     "allilist/" +
//                corpaly +
//                charCorp +
//                "/";
//        System.out.println(baseUrl);
//
//       /* String esiMethod = "characters";
//        String charId = "145137070";
//        String queryArg = "datasource=tranquility";
//*/
//        URI uri = new URI(baseUrl);
//        //String urlTarget = "https://esi.evetech.net/latest/characters/145137070/?datasource=tranquility";
//
//        HttpURLConnection httpClient =
//                (HttpURLConnection) new URL(uri.toString()).openConnection();
//
//        // optional default is GET
//        //     httpClient.setRequestMethod("GET");
//
//        //add request header
///*
//        httpClient.setRequestProperty("accept", "application/json");
//        httpClient.setRequestProperty("Accept-Language", "en-us");
//        httpClient.setRequestProperty("Content-Type", "application/json");
//*/
//
//        int responseCode = httpClient.getResponseCode();
//        //   System.out.println("\nSending 'GET' request to URL : " + uri.toString());
//        //     System.out.println("Response Code : " + responseCode);
//
//        try (BufferedReader in = new BufferedReader(
//                new InputStreamReader(httpClient.getInputStream()))) {
//
//            StringBuilder response = new StringBuilder();
//            String line;
//
//            while ((line = in.readLine()) != null) {
//                response.append(line);
//            }
//
//            //print result
//            // System.out.println(response.toString());
//            //  String input1 =  response.toString();
//
//
//           /*     String expression1 = "r_id\\\":(\\d+)";
//                RegEx regex1 = new RegEx(expression1);
//                ArrayList<ArrayList> ss = regex1.Find(response.toString());*/
//            /*    int result = ss.size();
//                System.out.println(ss);*/
//            final String regex = "r_id\\\":(\\d+)";
//            final String string = response.toString();
//
//            final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
//            final Matcher matcher = pattern.matcher(string);
//            ArrayList<String> ss = new ArrayList<>();
//
//            while (matcher.find()) {
//                //       System.out.println("Full match: " + matcher.group(0));
//                for (int i = 1; i <= matcher.groupCount(); i++) {
//                    //           System.out.println("Group " + i + ": " + matcher.group(i));
//                    String a = matcher.group(i);
//                    ss.add(a);
//                }
//            }
//            //       System.out.println(ss);
//            return ss;
//        }
//    }
//
//    public static void sending() throws Exception {
//        //   Npc4 newnpc = new Npc4();
//        NPC_webPLUS_O npc9 = new NPC_webPLUS_O();
//        // List <String> evewho3 = new ArrayList<> ();
//        //    ArrayList evewho3 = new ArrayList ();
//        String evewho3 = "";
//        try {
//            String path = "E:\\npc.txt";
//            BufferedReader br = new BufferedReader(new FileReader(path));
//            String sCurrentLine;
//            while ((sCurrentLine = br.readLine()) != null) {
//                evewho3 = evewho3 + (sCurrentLine + "\n");
//                //  all.add("\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //  npc9.log(evewho3);
//        System.out.println("finish");
//
//    }
//
//
//}
//
