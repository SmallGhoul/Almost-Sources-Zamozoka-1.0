package net.optifine.features.command;

import net.optifine.features.command.commands.*;
import net.optifine.features.command.util.AbstractCommand;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.TreeMap;

public final class CommandManager {
   // $FF: synthetic field
   public final SayCommand Harry = new SayCommand();
   // $FF: synthetic field
   public final TCommand James = new TCommand();
   // $FF: synthetic field
   public final DecreaseValueCommand George = new DecreaseValueCommand();
   // $FF: synthetic field
   public final BindCommand Oscar = new BindCommand();
   // $FF: synthetic field
   private final TreeMap<String, AbstractCommand> Mary = new TreeMap(String::compareToIgnoreCase);
   // $FF: synthetic field
   public final ToggleCommand William = new ToggleCommand();
   // $FF: synthetic field
   public final IncreaseValueCommand Thomas = new IncreaseValueCommand();
   // $FF: synthetic field
   public final InvseeCommand Jack = new InvseeCommand();
   // $FF: synthetic field
   public final ConfigLoadOrListOrSaveCommand Jacob = new ConfigLoadOrListOrSaveCommand();
   // $FF: synthetic field
   public final VClipCommand Charlie = new VClipCommand();
   // $FF: synthetic field
   public final HelpCommand Oliver = new HelpCommand();

   public AbstractCommand Oliver(String name) {
      AbstractCommand var2 = (AbstractCommand)this.Mary.get(String.valueOf((new StringBuilder()).append(".").append(name)));
      "".length();
      return null != null ? null : var2;
   }

   public Collection<AbstractCommand> Oliver() {
      Collection var1 = this.Mary.values();
      "".length();
      return -(137 ^ 140) >= 0 ? null : var1;
   }

   static {
      "".length();
      if (null == null) {
         ;
      }
   }

   public CommandManager() {
      try {
         Field[] var1 = CommandManager.class.getDeclaredFields();
         int var2 = var1.length;
         int var3 = 0;

         while(var3 < var2) {
            Field field = var1[var3];
            if (!(field.get(this) instanceof AbstractCommand)) {
               "".length();
               if ("  ".length() == "".length()) {
                  throw null;
               }
            } else {
               AbstractCommand cmd = (AbstractCommand)field.get(this);
               this.Mary.put(cmd.getName(), cmd);
               "".length();
            }

            ++var3;
            "".length();
            if ("   ".length() < "   ".length()) {
               throw null;
            }
         }
      } catch (Exception var6) {
         throw new RuntimeException();
      }

      "".length();
      if (-" ".length() > 0) {
         throw null;
      } else {
         "".length();
         if ("  ".length() < -" ".length()) {
            throw null;
         }
      }
   }
}
