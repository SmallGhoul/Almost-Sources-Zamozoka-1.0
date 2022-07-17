package net.optifine.features.module.combat;

import net.optifine.managers.event.events.PacketInputListener;
import net.optifine.managers.event.events.PacketInputListener.PacketInputEvent;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.gui.Translatable;
import net.minecraft.class_1297;
import net.minecraft.class_2613;
import net.minecraft.class_2781;
import net.minecraft.class_742;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.ArrayList;
import java.util.Iterator;

public class AntiBot extends Module implements PacketInputListener, UpdateListener {
   // $FF: synthetic field
   ArrayList<Integer> Jack = new ArrayList();

   public void Oliver(PacketInputEvent event) {
      if (event.Jacob() instanceof class_2781) {
         class_2781 p = (class_2781)event.Jacob();
         if (p.method_11938().size() > 0) {
            this.Jack.remove(p.method_11937());
            "".length();
         }
      }

      if (event.Jacob() instanceof class_2613) {
         class_2613 p = (class_2613)event.Jacob();
         this.Jack.add(p.method_11227());
         "".length();
      }

      "".length();
      if ("   ".length() == "   ".length()) {
         ;
      }
   }

   public boolean Oliver(class_1297 e) {
      boolean var2;
      if (!this.isEnabled()) {
         var2 = false;
         "".length();
         if (-(136 + 61 - 196 + 150 ^ 108 + 114 - 121 + 45) >= 0) {
            return (boolean)"".length();
         }
      } else if (!(e instanceof class_742)) {
         var2 = false;
         "".length();
         if ("".length() != 0) {
            return (boolean)"".length();
         }
      } else {
         var2 = this.Jack.contains(e.method_5628());
         "".length();
         if ("   ".length() == 0) {
            return (boolean)"".length();
         }
      }

      return var2;
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(PacketInputListener.class, this);
      this.Jack.clear();
      "".length();
      if (" ".length() > 0) {
         ;
      }
   }

   static {
      "".length();
      if ((53 + 132 - 152 + 159 ^ 49 + 71 - -66 + 10) != 0) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      EVENT_MANAGER.Oliver(PacketInputListener.class, this);
      "".length();
      if ("".length() >= 0) {
         ;
      }
   }

   public void Thomas() {
      ArrayList<Integer> toRemove = new ArrayList();
      Iterator var2 = this.Jack.iterator();

      do {
         int e;
         if (!var2.hasNext()) {
            var2 = toRemove.iterator();

            do {
               if (!var2.hasNext()) {
                  "".length();
                  if ("".length() > " ".length()) {
                     return;
                  }

                  return;
               }

               e = (Integer)var2.next();
               this.Jack.remove(e);
               "".length();
               "".length();
            } while("".length() >= 0);

            return;
         }

         e = (Integer)var2.next();
         class_1297 en = mc.field_1687.method_8469(e);
         if (en == null) {
            toRemove.add(e);
            "".length();
         }

         "".length();
      } while(null == null);

   }

   public AntiBot() {
      super("AntiBot", Translatable.ANTIBOT_DESC, Category.Oliver);
      "".length();
      if (" ".length() == "   ".length()) {
         throw null;
      }
   }
}
