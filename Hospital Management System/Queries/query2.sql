select patient.patient_id, person.person_name, address.country, address.zone, address.city, address.street, address.street_no
from (person inner join address on person.person_id = address.person_id) inner join patient on person.person_id = patient.person_id
/
