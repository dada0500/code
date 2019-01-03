package com.heima.demo;

import java.util.Date;

public class Emp {
    private Integer id;
    private String ename;
    private Integer job_id;
    private Integer mgr;
    private Date joindate;
    private Double salary;
    private Double bonus;
    private Integer dept_id;

    @Override
    public String toString () {
        return "Emp{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", job_id=" + job_id +
                ", mgr=" + mgr +
                ", joindate=" + joindate +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", dept_id=" + dept_id +
                '}';
    }

    public Emp () {
    }

    public Emp (Integer id, String ename, Integer job_id, Integer mgr, Date joindate, Double salary, Double bonus, Integer dept_id) {
        this.id = id;
        this.ename = ename;
        this.job_id = job_id;
        this.mgr = mgr;
        this.joindate = joindate;
        this.salary = salary;
        this.bonus = bonus;
        this.dept_id = dept_id;
    }

    public Integer getId () {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public String getEname () {
        return ename;
    }

    public void setEname (String ename) {
        this.ename = ename;
    }

    public Integer getJob_id () {
        return job_id;
    }

    public void setJob_id (Integer job_id) {
        this.job_id = job_id;
    }

    public Integer getMgr () {
        return mgr;
    }

    public void setMgr (Integer mgr) {
        this.mgr = mgr;
    }

    public Date getJoindate () {
        return joindate;
    }

    public void setJoindate (Date joindate) {
        this.joindate = joindate;
    }

    public Double getSalary () {
        return salary;
    }

    public void setSalary (Double salary) {
        this.salary = salary;
    }

    public Double getBonus () {
        return bonus;
    }

    public void setBonus (Double bonus) {
        this.bonus = bonus;
    }

    public Integer getDept_id () {
        return dept_id;
    }

    public void setDept_id (Integer dept_id) {
        this.dept_id = dept_id;
    }
    /*
* Field     Type          Collation        Null    Key     Default  Extra   Privileges                       Comment
--------  ------------  ---------------  ------  ------  -------  ------  -------------------------------  ---------
id        int(11)       (NULL)           NO      PRI     (NULL)           select,insert,update,references
ename     varchar(50)   utf8_general_ci  YES             (NULL)           select,insert,update,references
job_id    int(11)       (NULL)           YES     MUL     (NULL)           select,insert,update,references
mgr       int(11)       (NULL)           YES             (NULL)           select,insert,update,references
joindate  date          (NULL)           YES             (NULL)           select,insert,update,references
salary    decimal(7,2)  (NULL)           YES             (NULL)           select,insert,update,references
bonus     decimal(7,2)  (NULL)           YES             (NULL)           select,insert,update,references
dept_id   int(11)       (NULL)           YES     MUL     (NULL)           select,insert,update,references

* */
/*  `id` int(11) NOT NULL,
  `ename` varchar(50) DEFAULT NULL,
  `job_id` int(11) DEFAULT NULL,
  `mgr` int(11) DEFAULT NULL,
  `joindate` date DEFAULT NULL,
            `salary` decimal(7,2) DEFAULT NULL,
  `bonus` decimal(7,2) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,}*/


}