package oop.lab1;

import java.util.List;
import java.util.Map;

enum Planets {
    Earth,
    Asgard,
    Betelgeuse,
    Vogsphere,
    Kashyyyk,
    Endor
}

public class Filter {
    static Map<String, Universe> filter(List<Individual> individuals, Map<String, Universe> universeMap) {
        for (Individual ind : individuals) {
            String planet = ind.getPlanet();
            if(planet != null){
                switch(planet.toLowerCase()){
                    case "betelgeuse":
                    case "vogsphere":
                        universeMap.get("hitchHiker").inhabitants.add(ind);
                        break;

                    case "asgard":
                        universeMap.get("marvel").inhabitants.add(ind);
                        break;

                    case "earth":
                        universeMap.get("rings").inhabitants.add(ind);
                        break;

                    case "endor":
                    case "kashyyyk":
                        universeMap.get("starWars").inhabitants.add(ind);
                        break;
                }
            } else universeMap.get("unknown").inhabitants.add(ind);
        }
        return universeMap;
    }
}
