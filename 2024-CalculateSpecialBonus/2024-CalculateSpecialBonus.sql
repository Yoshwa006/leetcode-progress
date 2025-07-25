-- Last updated: 7/25/2025, 8:50:37 AM
    select employee_id , salary * ( employee_id%2 ) * ( name not like 'M%') as bonus
    from employees
    order by employee_id;