package com.orientechnologies.orient.client.remote.message;

import java.io.IOException;

import com.orientechnologies.orient.client.binary.OBinaryRequestExecutor;
import com.orientechnologies.orient.client.remote.OBinaryRequest;
import com.orientechnologies.orient.client.remote.OBinaryResponse;
import com.orientechnologies.orient.client.remote.OStorageRemoteSession;
import com.orientechnologies.orient.enterprise.channel.binary.OChannelBinaryProtocol;
import com.orientechnologies.orient.enterprise.channel.binary.OChannelDataInput;
import com.orientechnologies.orient.enterprise.channel.binary.OChannelDataOutput;

public class OCloseRequest implements OBinaryRequest<OBinaryResponse> {
  @Override
  public void write(OChannelDataOutput network, OStorageRemoteSession session) throws IOException {

  }

  @Override
  public void read(OChannelDataInput channel, int protocolVersion, String serializerName) throws IOException {

  }

  @Override
  public byte getCommand() {
    return OChannelBinaryProtocol.REQUEST_DB_CLOSE;
  }

  @Override
  public String getDescription() {
    return "Close Database";
  }
  
  @Override
  public boolean requireDatabaseSession() {
    return false;
  }
  
  @Override
  public OBinaryResponse createResponse() {
    return null;
  }

  @Override
  public OBinaryResponse execute(OBinaryRequestExecutor ex) {
    return ex.executeClose(this);
  }

}