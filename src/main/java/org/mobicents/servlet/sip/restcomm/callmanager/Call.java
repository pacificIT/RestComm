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
package org.mobicents.servlet.sip.restcomm.callmanager;

public interface Call {
  public void answer() throws CallException;
  public void bridge(Call call) throws CallException;
  public void connect() throws CallException;
  public void dial() throws CallException;
  public void disconnect() throws CallException;
  public CallManager getCallManager();
  public String getDirection();
  public String getId();
  public String getOriginator();
  public MediaPlayer getPlayer();
  public String getRecipient();
  public MediaRecorder getRecorder();
  public DtmfDetector getSignalDetector();
  public SpeechSynthesizer getSpeechSynthesizer();
  public String getStatus();
  public void hangup();
  public boolean isBridged();
  public boolean isConnected();
  public boolean isInConference();
  public void join(Conference conference) throws CallException;
  public void leave(Conference conference) throws CallException;
  public void reject();
  public void unbridge(Call call) throws CallException;
}