package net.optifine.features.module.util;

import net.optifine.Global;
import net.optifine.managers.event.events.ChatInputListener;
import net.optifine.managers.event.events.ChatInputListener.ChatInputEvent;
import net.optifine.managers.event.events.PacketInputListener;
import net.optifine.managers.event.events.PacketInputListener.PacketInputEvent;
import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.optifine.managers.event.events.PreMotionListener;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.ArrayList;
import java.util.List;

public class WellMoreAssist extends Module implements ChatInputListener, PacketInputListener, PacketOutputListener, PreMotionListener {
   // $FF: synthetic field
   boolean James = false;
   // $FF: synthetic field
   int Jack = 0;
   // $FF: synthetic field
   boolean Oscar = false;
   // $FF: synthetic field
   int Harry = 0;
   // $FF: synthetic field
   int Charlie = 9;
   // $FF: synthetic field
   int Thomas = 0;
   // $FF: synthetic field
   List<class_1799> George = new ArrayList();
   // $FF: synthetic field
   int Jacob = 0;

   public void George() {
      if (this.James && this.Harry-- <= 0) {
         boolean clicked = false;
         int i = 0;

         while(i < this.George.size()) {
            class_1799 is = (class_1799)this.George.get(i);
            if (is.method_7909().equals(class_1802.field_8802) && i > this.Charlie) {
               clicked = true;
               mc.field_1724.field_3944.method_2883(new class_2813(this.Thomas, i, 0, class_1713.field_7790, is, (short)i));
               ++this.Charlie;
               this.Harry = 1;
               "".length();
               if (-" ".length() >= 0) {
                  return;
               }
               break;
            }

            ++i;
            "".length();
            if (null != null) {
               return;
            }
         }

         if (!clicked) {
            this.Charlie = 9;
         }
      }

      if (this.Jacob == 2) {
         mc.field_1724.field_3944.method_2883(new class_2886(class_1268.field_5808));
         this.Jacob = 0;
         "".length();
         if (-(7 ^ 104 ^ 110 ^ 4) >= 0) {
            return;
         }
      } else if (this.Jacob == 1) {
         if (mc.field_1724.field_7514.field_7545 != 0) {
            mc.field_1724.field_3944.method_2883(new class_2868(0));
         }

         this.Jacob = 2;
         "".length();
         if ((38 ^ 81 ^ 41 ^ 90) <= 0) {
            return;
         }
      } else {
         if (this.Jacob == 0 && this.Jack-- <= 0 && mc.field_1724.field_7514.method_5438(0).method_7909() == class_1802.field_8371 && mc.field_1724.field_7514.method_5438(1).method_7909() == class_1802.field_8802) {
            this.Jacob = 1;
            this.Jack = 100;
         }

         if (this.Jacob == 4) {
            mc.field_1724.field_3944.method_2883(new class_2886(class_1268.field_5808));
            this.Jacob = 0;
            "".length();
            if ("  ".length() == (24 ^ 28)) {
               return;
            }
         } else if (this.Jacob == 3) {
            if (mc.field_1724.field_7514.field_7545 != 0) {
               mc.field_1724.field_3944.method_2883(new class_2868(0));
            }

            this.Jacob = 4;
            "".length();
            if ("  ".length() == "".length()) {
               return;
            }
         } else {
            if (this.Jacob == 0 && this.Jack-- <= 0 && mc.field_1724.field_7514.method_5438(0).method_7909() == class_1802.field_8371 && mc.field_1724.field_7514.method_5438(1).method_7909() == class_1802.field_8802) {
               this.Jacob = 1;
               this.Jack = 100;
            }

            if (this.Jacob == 0 && !this.James && mc.field_1724.field_7514.method_5438(0).method_7909() == class_1802.field_8251 && mc.field_1724.field_7514.method_5438(8).method_7909() == class_1802.field_8135) {
               this.Jacob = 3;
               this.Jack = 100;
            }

            "".length();
            if (-" ".length() > " ".length()) {
               return;
            }
         }
      }

   }

   public void onSentPacket(PacketOutputEvent event) {
      if (event.Jacob() instanceof class_2815) {
         this.Oscar = false;
         this.James = false;
      }

      "".length();
      if ("  ".length() <= "  ".length()) {
         ;
      }
   }

   public void Oliver(PacketInputEvent event) {
      if (event.Jacob() instanceof class_3944) {
         class_3944 p = (class_3944)event.Jacob();
         if (p.method_17593().equals(class_3917.field_18665) && Integer.valueOf(-1069898035).equals(p.method_17594().method_10851().hashCode())) {
            this.Oscar = true;
            event.Oliver();
         }

         if (p.method_17593().equals(class_3917.field_18667) && Integer.valueOf(-1396972563).equals(p.method_17594().method_10851().hashCode())) {
            this.James = true;
            event.Oliver();
         }
      }

      if (event.Jacob() instanceof class_2649 && (this.Oscar || this.James)) {
         class_2649 p = (class_2649)event.Jacob();
         if (this.Oscar) {
            int i = 0;

            while(i < p.method_11441().size()) {
               class_1799 is = (class_1799)p.method_11441().get(i);
               if (is.method_7947() > 1 && !is.method_7909().equals(class_1802.field_8301) && !is.method_7909().equals(class_1802.field_8255) && !is.method_7909().method_7848().toString().contains("Анархо")) {
                  System.out.println(is.method_7909().method_7848().method_10851());
                  mc.field_1724.field_3944.method_2883(new class_2813(p.method_11440(), i, 0, class_1713.field_7790, is, (short)0));
                  mc.field_1724.field_3944.method_2883(new class_2815(p.method_11440()));
                  "".length();
                  if ("".length() != "".length()) {
                     return;
                  }
                  break;
               }

               ++i;
               "".length();
               if (" ".length() != " ".length()) {
                  return;
               }
            }
         }

         if (this.James) {
            this.George = p.method_11441();
            this.Thomas = p.method_11440();
         }
      }

      if (event.Jacob() instanceof class_2645) {
         this.Oscar = false;
         this.James = false;
      }

      "".length();
      if (-" ".length() < 0) {
         ;
      }
   }

   public WellMoreAssist() {
      super("WellMoreAssist", "", Category.Charlie);
      "".length();
      if (-(34 ^ 38) > 0) {
         throw null;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(PreMotionListener.class, this);
      EVENT_MANAGER.Oliver(ChatInputListener.class, this);
      EVENT_MANAGER.Oliver(PacketInputListener.class, this);
      EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
      this.Oscar = false;
      "".length();
      if (-"   ".length() < 0) {
         ;
      }
   }

   public void Oliver(ChatInputEvent event) {
      String msg = event.Jacob().getString();
      if (Integer.valueOf(676168682).equals(msg.hashCode())) {
         Global.Jack().JacoB.Oliver(false);
      }

      if (msg.startsWith("Дуэли > 1v1 против ")) {
         this.Oscar = false;
         Global.Jack().JacoB.Oliver(true);
      }

      "".length();
      if ("  ".length() >= "  ".length()) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(PreMotionListener.class, this);
      EVENT_MANAGER.Jack(ChatInputListener.class, this);
      EVENT_MANAGER.Jack(PacketInputListener.class, this);
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      "".length();
      if (-(68 ^ 65) < 0) {
         ;
      }
   }

   static {
      "".length();
      if (" ".length() == " ".length()) {
         ;
      }
   }
}
