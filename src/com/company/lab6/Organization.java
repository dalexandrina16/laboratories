package com.company.lab6;

import java.util.Collections;

public class Organization {
    public static void main(String[] args) {
        Hospital hospital1 = new Hospital();
        hospital1.setAddress(new Address("or. Chisinau, str. Tranzistoarelor 24/2"));
        Surgeon john = new Surgeon();
        john.setFullName(new FullName("John", "Ivan", "Moskvich"));
        john.setEducation(Collections.singletonList("Scoala primara numarul 3"));
        john.setCertification(Collections.singletonList("A citit tehnica securitatii"));
        john.setHomeAddress(new Address("poltava"));
        Department oncology = new Department();
        oncology.setStaff(Collections.<Staff>singletonList(john));
        hospital1.setDepartments(Collections.singletonList(oncology));
        Patient samuel = new Patient();
        samuel.setGivenName("Samuel");
        samuel.setAllergies(Collections.singletonList("John - the surgeon"));
        samuel.setPrescriptions(Collections.singletonList("Anti - John - the surgeon"));
        samuel.setOperationsStaff(Collections.<OperationsStaff>singletonList(john));

        if (samuel.getOperationsStaff().contains(john)) {
            System.out.println("RIP Sam (");
        }
    }
}
