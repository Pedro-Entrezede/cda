/*!
* Copyright 2002 - 2013 Webdetails, a Pentaho company.  All rights reserved.
* 
* This software was developed by Webdetails and is provided under the terms
* of the Mozilla Public License, Version 2.0, or any later version. You may not use
* this file except in compliance with the license. If you need a copy of the license,
* please go to  http://mozilla.org/MPL/2.0/. The Initial Developer is Webdetails.
*
* Software distributed under the Mozilla Public License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
* the license for the specific language governing your rights and limitations.
*/

package pt.webdetails.cda;

//import java.util.List;
//import java.util.Map;
import java.util.Properties;

import org.pentaho.reporting.libraries.formula.FormulaContext;

import pt.webdetails.cda.cache.ICacheScheduleManager;
import pt.webdetails.cda.cache.IQueryCache;
import pt.webdetails.cda.connections.mondrian.IMondrianRoleMapper;
import pt.webdetails.cda.dataaccess.ICubeFileProviderSetter;
import pt.webdetails.cda.dataaccess.IDataAccessUtils;
import pt.webdetails.cda.settings.IResourceKeyGetter;
//import pt.webdetails.cpf.IPluginCall;
import pt.webdetails.cpf.messaging.IEventPublisher;
import pt.webdetails.cpf.repository.api.IContentAccessFactory;
import pt.webdetails.cpf.session.ISessionUtils;


public interface ICdaEnvironment {

  public void init() throws InitializationException;

  public ICubeFileProviderSetter getCubeFileProviderSetter();

  public IQueryCache getQueryCache();

  public IMondrianRoleMapper getMondrianRoleMapper();

  /**
   * {@link FormulaContext} exposing parameters in CDA formulas.<br>
   * Refer to implementations for available parameters.
   */
  public FormulaContext getFormulaContext();

  public Properties getCdaComponents();

  public IEventPublisher getEventPublisher();

  public ISessionUtils getSessionUtils();

  // public IRepositoryAccess getRepositoryAccess();

  public IDataAccessUtils getDataAccessUtils();

  public IResourceKeyGetter getResourceKeyGetter();

  // public IPluginCall createPluginCall(String plugin, String method, Map<String, Object> params);

  public boolean supportsCacheScheduler();

  public ICacheScheduleManager getCacheScheduler();

  IContentAccessFactory getRepo();

}