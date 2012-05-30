/*
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.mobicents.commons.fsm;

import org.mobicents.commons.annotations.NotThreadSafe;
import org.mobicents.commons.event.Event;

/**
 * @author quintana.thomas@gmail.com (Thomas Quintana)
 */
@NotThreadSafe public class TurnOnAction implements Action {
  private final LightBulb lightbulb;
  
  public TurnOnAction(final LightBulb lightbulb) {
    super();
    this.lightbulb = lightbulb;
  }

  @Override public void execute(final Event<?> event, final State state) {
    lightbulb.turnOn();
    final StringBuilder buffer = new StringBuilder();
    buffer.append(lightbulb.getClass().getName()).append(" On");
    System.out.println(buffer.toString());
  }
}
