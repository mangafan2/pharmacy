package mahmud.sup.galilee.pharmacy;

import mahmud.sup.galilee.pharmacy.Medicament;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class MedicamentService {

    private static final Map<Long, Medicament> medicaments = new HashMap<>();
    private static final AtomicLong counter = new AtomicLong();

    static {
        medicaments.put(counter.incrementAndGet(), new Medicament(counter.get(), "Paracétamol", "Antidouleur", 100));
        medicaments.put(counter.incrementAndGet(), new Medicament(counter.get(), "Ibuprofène", "Anti-inflammatoire", 50));
        medicaments.put(counter.incrementAndGet(), new Medicament(counter.get(), "Amoxicilline", "Antibiotique", 75));
        medicaments.put(counter.incrementAndGet(), new Medicament(counter.get(), "Cétirizine", "Antihistaminique", 120));
        medicaments.put(counter.incrementAndGet(), new Medicament(counter.get(), "Metformine", "Antidiabétique", 90));
        medicaments.put(counter.incrementAndGet(), new Medicament(counter.get(), "Lorazépam", "Anxiolytique", 10));
        medicaments.put(counter.incrementAndGet(), new Medicament(counter.get(), "Simvastatine", "Hypolipémiant", 27));
    }
    public List<Medicament> listerTous() {
        return new ArrayList<>(medicaments.values());
    }
    public Medicament sauvegarder(Medicament medicament) {
        Long id = counter.incrementAndGet();
        medicament.setId(id);
        medicaments.put(id, medicament);
        return medicament;
    }
    public Medicament mettreAJour(Long id, Medicament medicament) {
        medicament.setId(id);
        medicaments.put(id, medicament);
        return medicament;
    }
    public void supprimer(Long id) {
        medicaments.remove(id);
    }
}