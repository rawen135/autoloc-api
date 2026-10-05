package tn.esprit.autoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeService implements IEmployeService {
    @Autowired
    EmployeeRepository employeRepo;

    @Override
    public List<Employe> retrieveAllEmployes() {
        return (List<Employe>) employeRepo.findAll();
    }

    @Override
    public Employe addEmploye(Employe e) {
        return employeRepo.save(e);
    }

    @Override
    public Employe updateEmploye(Employe e) {
        return employeRepo.save(e);
    }

    @Override
    public Employe retrieveEmploye(Long idEmploye) {
        return employeRepo.findById(idEmploye).orElse(null);
    }

    @Override
    public void removeEmploye(Long idEmploye) {
        employeRepo.deleteById(idEmploye);
    }

    @Override
    public List<Employe> addEmployes(List<Employe> employes) {
        return (List<Employe>) employeRepo.saveAll(employes);
    }
}
