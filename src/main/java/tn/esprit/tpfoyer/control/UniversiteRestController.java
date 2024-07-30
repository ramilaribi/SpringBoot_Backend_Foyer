package tn.esprit.tpfoyer.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.service.IUniversiteService;

import java.util.List;

@Tag(name = "Gestion de universite")
@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {
    IUniversiteService universiteService;
@Operation(description = "récupérer toutes les universites de la base de donneés  ")
    // http://localhost:8089/tpuniversite/universite/retrieve-all-universites
    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversites();
        return listUniversites;
    }
    @Operation(description = "récuprérer la universite de la base de données à partir de son identifiant")
    // http://localhost:8089/tpuniversite/universite/retrieve-universite/8
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long fId) {
        Universite universite = universiteService.retrieveUniversite(fId);
        return universite;
    }
    @Operation(description = "Ajouter une universite à la base de donneés")
    // http://localhost:8089/tpuniversite/universite/add-universite
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }
    @Operation(description = "supprmier une universite avec un identifiant specifique de la base de donneés")
    // http://localhost:8089/tpuniversite/universite/remove-universite/{universite-id}
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long uId) {
        universiteService.removeUniversite(uId);
    }
    @Operation(description = "modifier une universite avec un identifiant specifique de la base de donneés")
    // http://localhost:8089/tpuniversite/universite/modify-universite
    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite f) {
        Universite universite = universiteService.modifyUniversite(f);
        return universite;
    }
}
