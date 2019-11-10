package com.example.icommerce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import com.example.icommerce.DAO.AchatRepository;
import com.example.icommerce.DAO.BoutiqueRepository;
import com.example.icommerce.DAO.CategorieRepository;
import com.example.icommerce.DAO.ClientRepository;
import com.example.icommerce.DAO.CommercantRepository;
import com.example.icommerce.DAO.CommuneRepository;
import com.example.icommerce.DAO.DepartementRepository;
import com.example.icommerce.DAO.ProduitRepository;
import com.example.icommerce.DAO.QuatierRepository;
import com.example.icommerce.DAO.RegionRepository;
import com.example.icommerce.DAO.RoleRepository;
import com.example.icommerce.DAO.UtilisateurRepository;
import com.example.icommerce.entities.Achat;
import com.example.icommerce.entities.Boutique;
import com.example.icommerce.entities.Categorie;
import com.example.icommerce.entities.Client;
import com.example.icommerce.entities.Commercant;
import com.example.icommerce.entities.Commune;
import com.example.icommerce.entities.Departement;
import com.example.icommerce.entities.Produit;
import com.example.icommerce.entities.Quartier;
import com.example.icommerce.entities.Region;
import com.example.icommerce.entities.Role;
import com.example.icommerce.entities.Utilisateur;

@SpringBootApplication
public class IcommerceApplication  implements CommandLineRunner{

	@Autowired
	CategorieRepository  categorieRepository;
	
	@Autowired
	ProduitRepository  produitRepository;
	@Autowired
	BoutiqueRepository boutiqueRepository  ;
	@Autowired
	ClientRepository clientRepository;
	@Autowired
	AchatRepository achaRepository;
	@Autowired
    CommercantRepository commmercantRepository;
	@Autowired
    CommuneRepository communeRepository;
	@Autowired
	QuatierRepository quartierRepository;
	@Autowired
	DepartementRepository departementRepository;
	@Autowired
	RegionRepository regionRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	

	public static void main(String[] args) {
		SpringApplication.run(IcommerceApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		 Categorie C1= categorieRepository.save(new Categorie("Ordinateurs","Ordinateurs Portables"));
		 
		 
		produitRepository.save(new Produit(	1,"Ordinateurs HP", "Ordinateurs HP 34425 Core i7 dernière génération", 600000)).setCategorie(C1);
		boutiqueRepository.save(new Boutique("AUCHAN","pointE"));
		clientRepository.save(new Client("seydi","awa","awaseydi@gmail.com"));
		achaRepository.save(new Achat(10,100000,1000000));
		commmercantRepository.save(new Commercant("samb","mouhamed","awaseydi@gmail.com"));
		communeRepository.save(new Commune("dakar"));
		quartierRepository.save(new Quartier("pointE","rue george "));
		departementRepository.save(new Departement("Dakar"));
		regionRepository.save(new Region("Dakar"));
		
		roleRepository.save(new Role("admin"));
		utilisateurRepository.save(new Utilisateur("diouf","fatou",null, "05/08/1992","eve@gmail.com","xxxxxxx"));
		
		
		
	}
}