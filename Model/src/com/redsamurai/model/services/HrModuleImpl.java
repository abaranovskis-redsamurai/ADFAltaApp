package com.redsamurai.model.services;

import com.redsamurai.model.views.DepartmentsViewImpl;
import com.redsamurai.model.views.EmployeesViewImpl;

import oracle.jbo.Session;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Dec 03 14:36:23 EET 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HrModuleImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public HrModuleImpl() {
    }

    /**
     * Container's getter for EmployeesView1.
     * @return EmployeesView1
     */
    public EmployeesViewImpl getEmployeesView1() {
        return (EmployeesViewImpl) findViewObject("EmployeesView1");
    }

    /**
     * Container's getter for EmployeesView2.
     * @return EmployeesView2
     */
    public EmployeesViewImpl getEmployeesView2() {
        return (EmployeesViewImpl) findViewObject("EmployeesView2");
    }

    /**
     * Container's getter for CountriesView1.
     * @return CountriesView1
     */
    public ViewObjectImpl getCountriesView1() {
        return (ViewObjectImpl) findViewObject("CountriesView1");
    }

    /**
     * Container's getter for DepartmentsView1.
     * @return DepartmentsView1
     */
    public DepartmentsViewImpl getDepartmentsView1() {
        return (DepartmentsViewImpl) findViewObject("DepartmentsView1");
    }

    /**
     * Container's getter for EmpManagerFkLink1.
     * @return EmpManagerFkLink1
     */
    public ViewLinkImpl getEmpManagerFkLink1() {
        return (ViewLinkImpl) findViewLink("EmpManagerFkLink1");
    }

    @Override
    protected void prepareSession(Session session) {
        super.prepareSession(session);
        
        this.getDBTransaction().setClearCacheOnRollback(false);
    }
}
