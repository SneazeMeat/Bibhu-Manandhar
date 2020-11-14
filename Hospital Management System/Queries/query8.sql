select patient.patient_id, person.person_name, appointment.appointment_id, appointment.appointment_date
from (person join patient on person.person_id = patient.person_id) join appointment on patient.patient_id = appointment.patient_id
where appointment.appointment_date='&date'
/
