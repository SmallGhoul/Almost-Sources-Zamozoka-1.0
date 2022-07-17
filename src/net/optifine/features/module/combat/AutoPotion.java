package net.optifine.features.module.combat;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.managers.event.events.PacketInputListener;
import net.optifine.managers.event.events.PacketInputListener.PacketInputEvent;
import net.optifine.managers.event.events.PreMotionListener;
import net.optifine.util.RotationUtils;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.Iterator;

public class AutoPotion extends Module implements PreMotionListener, PacketInputListener {
   // $FF: synthetic field
   BooleanSetting Oscar = new BooleanSetting("Client Slot Switcher", true);
   // $FF: synthetic field
   int Harry = 10;
   // $FF: synthetic field
   int Charlie = 10;
   // $FF: synthetic field
   int George = 0;
   // $FF: synthetic field
   int Jacob = 10;
   // $FF: synthetic field
   int Thomas = 0;
   // $FF: synthetic field
   BooleanSetting James = new BooleanSetting("Notifications", true);
   // $FF: synthetic field
   int Jack = 0;

   public void George() {
      --this.Thomas;
      --this.Harry;
      --this.Jacob;
      --this.Charlie;
      if (this.Thomas > 0) {
         "".length();
         if (null != null) {
            return;
         }
      } else {
         class_1661 inventory = mc.field_1724.field_7514;
         if (this.Jack == 4) {
            float yaw = Global.George().getYaw();
            float pitch = RotationUtils.getFixedRotation((mc.field_1724.field_5965 - Global.George().getPitch()) / 2.0F) + Global.George().getPitch();
            Global.George().applyWithPacket(yaw, pitch, true);
            this.Jack = 0;
            this.Oliver(this.George);
            "".length();
            if (-(127 ^ 39 ^ 238 ^ 178) >= 0) {
               return;
            }
         } else if (Global.Jack().JacoB.isEnabled() && Global.Jack().JacoB.Patricia()) {
            "".length();
            if (" ".length() != " ".length()) {
               return;
            }
         } else {
            if (this.Jack == 2) {
               this.Jack = 3;
               Global.Jack.getInteractionManager().clickItem(class_1268.field_5808);
            }

            boolean var10000;
            if (!mc.field_1724.method_6059(class_1294.field_5918) && this.Oliver(inventory, class_1294.field_5918) != -1 && this.Harry < 0) {
               var10000 = true;
               "".length();
               if (-(165 ^ 160) >= 0) {
                  return;
               }
            } else {
               var10000 = false;
            }

            boolean fire = var10000;
            if (!mc.field_1724.method_6059(class_1294.field_5910) && this.Oliver(inventory, class_1294.field_5910) != -1 && this.Jacob < 0) {
               var10000 = true;
               "".length();
               if ((78 ^ 74) <= " ".length()) {
                  return;
               }
            } else {
               var10000 = false;
            }

            boolean strength = var10000;
            if (!mc.field_1724.method_6059(class_1294.field_5904) && this.Oliver(inventory, class_1294.field_5904) != -1 && this.Charlie < 0) {
               var10000 = true;
               "".length();
               if ("   ".length() == 0) {
                  return;
               }
            } else {
               var10000 = false;
            }

            boolean speed = var10000;
            if (this.Jack == 0 || this.Jack == 3) {
               if (fire) {
                  this.Oliver(this.Oliver(inventory, class_1294.field_5918));
                  this.Harry = 10;
                  "".length();
                  if ("  ".length() != "  ".length()) {
                     return;
                  }
               } else if (strength) {
                  this.Oliver(this.Oliver(inventory, class_1294.field_5910));
                  this.Jacob = 10;
                  "".length();
                  if ("  ".length() < 0) {
                     return;
                  }
               } else if (speed) {
                  this.Oliver(this.Oliver(inventory, class_1294.field_5904));
                  this.Charlie = 10;
                  "".length();
                  if ("".length() >= "   ".length()) {
                     return;
                  }
               } else if (this.Jack == 3) {
                  this.Jack = 4;
               }
            }

            if (!fire && !strength && !speed) {
               if (this.Jack == 0) {
                  this.George = inventory.field_7545;
               }
            } else {
               float yaw = Global.George().getYaw();
               if (this.Jack == 0) {
                  float pitch = RotationUtils.getFixedRotation((90.0F - Global.George().getPitch()) / 2.0F) + Global.George().getPitch();
                  Global.George().applyWithPacket(yaw, pitch, true);
                  this.Jack = 1;
                  "".length();
                  if (-" ".length() == (144 ^ 130 ^ 82 ^ 68)) {
                     return;
                  }
               } else if (this.Jack == 1 || this.Jack == 3) {
                  Global.George().applyWithPacket(yaw, 90.0F, true);
                  this.Jack = 2;
               }

               "".length();
               if ("   ".length() == "  ".length()) {
                  return;
               }
            }

            "".length();
            if ("  ".length() < "  ".length()) {
               return;
            }
         }
      }

   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(PreMotionListener.class, this);
      EVENT_MANAGER.Oliver(PacketInputListener.class, this);
      "".length();
      if (" ".length() <= (68 ^ 112 ^ 77 ^ 125)) {
         ;
      }
   }

   public void Oliver(PacketInputEvent event) {
      if (event.Jacob() instanceof class_2708) {
         this.Thomas = 2;
      }

      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(PreMotionListener.class, this);
      EVENT_MANAGER.Jack(PacketInputListener.class, this);
      "".length();
      if (-"  ".length() < 0) {
         ;
      }
   }

   void Oliver(int slot) {
      if (this.Oscar.Jack()) {
         mc.field_1724.field_7514.field_7545 = slot;
         "".length();
         if (" ".length() <= 0) {
            return;
         }
      } else {
         mc.field_1724.field_3944.method_2883(new class_2868(slot));
      }

      if (this.James.Jack()) {
         Global.Thomas().getNotificationManager().spawnNotification(this, String.valueOf((new StringBuilder()).append("Switched to ").append(slot).append(" slot (").append(mc.field_1724.field_7514.method_5438(slot).method_7964().getString()).append(")")));
      }

      "".length();
      if ((193 ^ 142 ^ 76 ^ 6) > 0) {
         ;
      }
   }

   public AutoPotion() {
      super("AutoPotion", "This module automatically uses potions in the inventory if they are not used", Category.Oliver);
      this.addSetting(this.Oscar);
      this.addSetting(this.James);
      "".length();
      if ((130 ^ 134) == -" ".length()) {
         throw null;
      }
   }

   int Oliver(class_1661 inventory, class_1291 type) {
      int nextSlot = -1;
      int slot = 0;

      do {
         if (slot >= 9) {
            "".length();
            if ("   ".length() < "  ".length()) {
               return "".length();
            }

            return nextSlot;
         }

         Iterator var5 = class_1844.method_8063(inventory.method_5438(slot)).method_8049().iterator();

         while(var5.hasNext()) {
            class_1293 inst = (class_1293)var5.next();
            if (inst.method_5579() == type) {
               nextSlot = slot;
            }

            "".length();
            if (-(123 ^ 127) >= 0) {
               return "".length();
            }
         }

         ++slot;
         "".length();
      } while("  ".length() > 0);

      return "".length();
   }

   static {
      "".length();
      if ((172 ^ 168) >= " ".length()) {
         ;
      }
   }
}
