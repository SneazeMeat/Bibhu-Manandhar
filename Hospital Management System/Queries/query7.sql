select employee.employee_id, person.person_name, appointment.appointment_id, treatment_info.treatment_charge
from (((person join employee on person.person_id = employee.person_id) join appointment on employee.employee_id = appointment.employee_id) join treatment on appointment.appointment_id = treatment.appointment_id) join treatment_info on treatment_info.tretment_id = treatment.treatment_id
where appointment.appointment_date='&date'
/
