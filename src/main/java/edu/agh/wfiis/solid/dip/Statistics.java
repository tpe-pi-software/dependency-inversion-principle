package edu.agh.wfiis.solid.dip;

import java.io.Serializable;
import java.util.Date;

public class Statistics implements Serializable {
   private String name;

   private Date day;
   private long visitorsCount;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Date getDay() {
      return day;
   }

   public void setDay(Date day) {
      this.day = day;
   }

   public long getVisitorsCount() {
      return visitorsCount;
   }

   public void setVisitorsCount(long visitorsCount) {
      this.visitorsCount = visitorsCount;
   }
}
