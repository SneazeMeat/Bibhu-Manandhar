select person.person_name, appointment.appointment_id, treatment_info.treatment_charge
from ((((person join employee on person.person_id=employee.person_id) join patient on person.person_id=patient.person_id) join appointment on patient.patient_id=appointment.patient_id) join treatment on appointment.appointment_id=treatment.appointment_id) join treatment_info on treatment.treatment_id=treatment_info.tretment_id
where employee.employee_certification='Uncertified'
/
