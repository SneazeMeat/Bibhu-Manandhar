select appointment.appointment_id, treatment.ward_type
from appointment join treatment on appointment.appointment_id=treatment.appointment_id
where treatment.ward_type = 'Emergency'
/
