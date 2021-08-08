package com.gandalsmart.Enforcer;

import main.java.com.gandalsmart.Main;

import java.util.Date;

public class Fonction {

    private static Object p1;
    private static Object e;
    private static Object modelText;

    public static <modelText> void TestHopitals() {
        p1 = new Person() {
            String Role = "Employé";
            String NomUser = "Mamadou";
        };
        p2 = new Main.Person() {
            String Role = "Docteur";
            String NomUser = "Adda";
        };

        Persons = new Person (p1, p2);

        g1  = new NomPorte() {
            String NomPorte = "Entrée";
        };
        g2  = new NomPorte() {
            String NomPorte = " Sortie ";
        };

        Portes = new Porte(g1, g2);

    final modelText =';

        // reproduction de notre model ABAC

 [request_definition]
        r = sub, obj, act, envi;
                [policy_definition]
        p = sub, obj, act
               [policy_effect]
        e = some(where(p.eft == allow))
                [matchers]
    m = r.sub.Role == 'Docteur' && r.obj.NomPorte == 'PorteHopital' && r.act
        in('Entrée', 'Sortie') && r.envi.Time.Hours >= 7 && r.envi.Time.Hours <= 20

        m = new model.Model();
        m.LoadModelFromText(modelText);
        e = new casbin.NewEnforcer(m);

        envi environs = new envi((InitEnvi(7), InitEnvi(20));

        for(String envi = environs){
            System.out.println(" \r\nTime: ", envi.Localtime());
            for(String p = Main.Person.getName(); p != null;
            {
                for(String g = Portes(){

                Passer = new e.Enforcer(p, g, "Entrée", envi);
                System.out.println(p.Role, p.NomUser, "Entrée", g.NomPorte, Passer);

                Passer = e.Enforcer(p, g, "Sortie", envi);
                System.println(p.Role, p.NomUser, "Sortie", g.Name, Passer);

            }
        }
        }
    }

    public static Envi InitEnv(Hours, envi){

        envi = new Envi(Hours);
        Date time;
        envi.Time = DateTime.now (2021, 9, 20, hour, 0, 0, 0, Localtime);
        return envi;
    }
}
