package Var_1;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void userVois(OurNotebook notebookUser, LinkedList list) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Параметры для фильтрации:\n1. Оперативная память\n2. Объем жесткого диска\n" +
                "3. Предустановленная ОС\n4. цвет\nВведите номер пункта меню или введите 5(Вывести список): ");
        int userChoise = iScanner.nextInt();
        switch (userChoise) {
            case 1:
                Scanner iScanner1 = new Scanner(System.in);
                System.out.printf("Выберите количество Оперативной памяти (8,16,32): ");
                int userRum = iScanner1.nextInt();
                notebookUser.ram = userRum;
                list.set(1, true);
                userVois(notebookUser, list);
                break;
            case 2:
                Scanner iScanner2 = new Scanner(System.in);
                System.out.printf("Выберите объем жесткого диска (250,500,1024): ");
                int userHdd = iScanner2.nextInt();
                notebookUser.hdd = userHdd;
                list.set(2, true);
                userVois(notebookUser, list);
                break;
            case 3:
                Scanner iScanner3 = new Scanner(System.in);
                System.out.printf("Выберите операционную систему(Windows, Linux): ");
                String userOSystem = iScanner3.nextLine();
                notebookUser.oSystem = userOSystem;
                list.set(3, true);
                userVois(notebookUser, list);
                break;
            case 4:
                Scanner iScanner4 = new Scanner(System.in);
                System.out.printf("Введите желаемый цвет ноутбука(Black, White, Silver: ");
                String userColore = iScanner4.nextLine();
                notebookUser.color = userColore;
                list.set(5, true);
                userVois(notebookUser, list);
                break;
            default:
                break;
        }
        iScanner.close();
    }


    private static boolean sortByRam(OurNotebook param, OurNotebook param2){
        if (param.ram >= param2.ram) {
            return true;
        }else {
            return false;
        }
    }

    private static boolean sortByHdd(OurNotebook param, OurNotebook param2){
        if (param.hdd >= param2.hdd) {
            return true;
        }else {
            return false;
        }
    }

    private static boolean sortByColore(OurNotebook param, OurNotebook param2){
        if ((param.color).equals(param2.color)) {
            return true;
        }else {
            return false;
        }
    }

    private static boolean sortByOsystem(OurNotebook param, OurNotebook param2){
        if ((param.oSystem).equals(param2.oSystem)) {
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        Set<OurNotebook> set = new HashSet<>();

        OurNotebook notebook1 = new OurNotebook("Lenovo", 8, 250, "Windows", "Black");
        OurNotebook notebook2 = new OurNotebook("Lenovo", 16, 500, "Windows", "Black");
        OurNotebook notebook3 = new OurNotebook("Lenovo", 32, 1024, "Windows", "Black");
        OurNotebook notebook4 = new OurNotebook("Lenovo", 32, 500, "Linux", "Black");
        OurNotebook notebook5 = new OurNotebook("Asus", 8, 250, "Windows", "White");
        OurNotebook notebook6 = new OurNotebook("Asus", 16, 500, "Windows", "silver");
        OurNotebook notebook7 = new OurNotebook("Asus", 32, 1024, "Windows", "Black");
        OurNotebook notebook8 = new OurNotebook("Asus", 32, 500, "Linux", "Black/silver");
        OurNotebook notebook9 = new OurNotebook("Dell", 16, 500, "Windows", "Black");
        OurNotebook notebook10 = new OurNotebook("Dell", 32, 500, "Windows", "Black");

        set.add(notebook1);
        set.add(notebook2);
        set.add(notebook3);
        set.add(notebook4);
        set.add(notebook5);
        set.add(notebook6);
        set.add(notebook7);
        set.add(notebook8);
        set.add(notebook9);
        set.add(notebook10);


        OurNotebook notebookUserchoise = new OurNotebook("default", 0, 0, "default", "default");
        LinkedList<Boolean> list = new LinkedList<>();
        list.add(false);
        list.add(false);
        list.add(false);
        list.add(false);
        userVois((OurNotebook) notebookUserchoise, list);
        Set<OurNotebook> setResult = new HashSet<>();

        Iterator<OurNotebook> iterator = set.iterator();
        while (iterator.hasNext()) {
            OurNotebook element = iterator.next();
            if (list.get(0) && list.get(1) && list.get(2) && list.get(3)){
                if (element.equalityHdd(notebookUserchoise) && element.equalityRam(notebookUserchoise) && element.equalsColore(notebookUserchoise) && element.equalsOS(notebookUserchoise)){
                    setResult.add(element);
                }
            } else if (list.get(1) && list.get(0) && list.get(2) && !(list.get(3))){
                if (element.equalityRam(notebookUserchoise) && element.equalsColore(notebookUserchoise) && element.equalityHdd(notebookUserchoise)){
                    setResult.add(element);
                }
            } else if (list.get(3) && list.get(0) && list.get(2) && !(list.get(1))){
                if (element.equalityHdd(notebookUserchoise) && element.equalsColore(notebookUserchoise) && element.equalsOS(notebookUserchoise)){
                    setResult.add(element);
                }
            } else if (list.get(3) && list.get(1) && list.get(2) && !(list.get(0))){
                if (element.equalityRam(notebookUserchoise) && element.equalsOS(notebookUserchoise) && element.equalityHdd(notebookUserchoise)){
                    setResult.add(element);
                }
            } else if (list.get(0) && list.get(1) && !(list.get(3)) && !(list.get(2))){
                if (sortByRam(element, notebookUserchoise) && sortByColore(element, notebookUserchoise)){
                    setResult.add(element);
                }
            } else if (list.get(0) && list.get(2) && !(list.get(1)) && !(list.get(3))){
                if (sortByColore(element, notebookUserchoise) && sortByHdd(element, notebookUserchoise)){
                    setResult.add(element);
                }
            } else if (list.get(2) && list.get(1) && !(list.get(0)) && !(list.get(3))){
                if (sortByRam(element, notebookUserchoise) && sortByHdd(element, notebookUserchoise)){
                    setResult.add(element);
                }
            } else if (list.get(0) && list.get(3) && !(list.get(1)) && !(list.get(2))){
                if (sortByColore(element, notebookUserchoise) && sortByOsystem(element, notebookUserchoise)){
                    setResult.add(element);
                }
            } else if (list.get(3) && list.get(1) && !(list.get(0)) && !(list.get(2))){
                if (sortByRam(element, notebookUserchoise) && sortByOsystem(element, notebookUserchoise)){
                    setResult.add(element);
                }
            } else if (list.get(2) && list.get(3) && !(list.get(1)) && !(list.get(0))){
                if (sortByHdd(element, notebookUserchoise) && sortByOsystem(element, notebookUserchoise)){
                    setResult.add(element);
                }
            } else if (list.get(0) && !(list.get(1)) && !(list.get(2)) && !(list.get(3))){
                if (sortByColore(element, notebookUserchoise)){
                    setResult.add(element);
                }
            } else if (list.get(1) && !(list.get(0)) && !(list.get(2)) && !(list.get(3))){
                if (sortByRam(element, notebookUserchoise)){
                    setResult.add(element);
                }
            } else if (list.get(2) && !(list.get(1)) && !(list.get(0)) && !(list.get(3))){
                if (sortByHdd(element, notebookUserchoise)){
                    setResult.add(element);
                }
            } else if (list.get(3) && !(list.get(1)) && !(list.get(2)) && !(list.get(0))){
                if (sortByOsystem(element, notebookUserchoise)){
                    setResult.add(element);
                }
            } else {
                break;
            }
        }
        int count = 1;
        if (setResult.isEmpty()){
            System.out.println("Ноутбуки в наличии: ");
            for (OurNotebook el : set) {
                System.out.println(count + ". " + el);
                count += 1;
            }
        } else {
            System.out.println("Ноутбуки в наличии: ");
            for (OurNotebook el : setResult) {
                System.out.println(count + ". " + el);
                count += 1;
            }
        }

    }
}