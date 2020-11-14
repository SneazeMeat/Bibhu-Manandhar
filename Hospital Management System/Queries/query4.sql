select person.person_ID,person.person_name, patient.patient_type
from person join patient on person.person_id=patient.person_id
where patient.patient_type = 'Employee'
/
