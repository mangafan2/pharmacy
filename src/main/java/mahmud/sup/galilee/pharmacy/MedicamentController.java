package mahmud.sup.galilee.pharmacy;

import mahmud.sup.galilee.pharmacy.Medicament;
import mahmud.sup.galilee.pharmacy.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicaments")
public class MedicamentController {

    private final MedicamentService medicamentService;

    @Autowired
    public MedicamentController(MedicamentService medicamentService) {
        this.medicamentService = medicamentService;
    }

    @GetMapping
    public List<Medicament> listerTous() {
        return medicamentService.listerTous();
    }

    @PostMapping
    public Medicament ajouterMedicament(@RequestBody Medicament medicament) {
        return medicamentService.sauvegarder(medicament);
    }

    @PutMapping("/{id}")
    public Medicament mettreAJourMedicament(@PathVariable Long id, @RequestBody Medicament medicament) {
        return medicamentService.mettreAJour(id, medicament);
    }

    @DeleteMapping("/{id}")
    public void supprimerMedicament(@PathVariable Long id) {
        medicamentService.supprimer(id);
    }
}
