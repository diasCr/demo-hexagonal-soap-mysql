/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.application.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

import ch.cristiano.demo1.domain.model.Family;
import ch.cristiano.demo1.domain.port.in.ExportFamiliesService;
import ch.cristiano.demo1.domain.port.in.FamilyService;

/**
 * Service adapter for UseCase OverviewService.
 */
@Stateless
public class DefaultExportFamiliesService implements ExportFamiliesService {

    @Inject
    private FamilyService familyService;

    @Override
    public String getAllFamiliesForExport() {
        List<Family> families = familyService.getAllFamilies();
        // prepare for export
        return "export";
    }

}
