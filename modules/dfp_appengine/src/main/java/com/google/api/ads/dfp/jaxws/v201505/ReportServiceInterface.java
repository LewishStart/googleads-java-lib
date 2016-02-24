
package com.google.api.ads.dfp.jaxws.v201505;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for executing a {@link ReportJob} and retrieving performance
 *       and statistics about ad campaigns, networks, inventory and sales.
 *       <p>Follow the steps outlined below:</p>
 *       <p>
 *       <ul>
 *       <li>Create the {@code ReportJob} object by invoking
 *       {@link ReportService#runReportJob}.</li>
 *       <li>Poll the {@code ReportJob} object using
 *       {@link ReportService#getReportJob}.</li>
 *       <li>Continue to poll the {@code ReportJob} object until the
 *       {@link ReportJob#reportJobStatus} field is equal to
 *       {@link ReportJobStatus#COMPLETED} or {@link ReportJobStatus#FAILED}.</li>
 *       <li>If successful, fetch the URL for downloading the report by invoking
 *       {@link ReportService#getReportDownloadURL}.</li>
 *       </ul>
 *       </p>
 *       
 *       <h4>Test network behavior</h4>
 *       
 *       <p>
 *       The networks created using {@link NetworkService#makeTestNetwork} are unable
 *       to provide reports that would be comparable to the production environment
 *       because reports require traffic history.
 *       In the test networks, reports will consistently return no data for all reports.
 *       </p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ReportServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReportServiceInterface {


    /**
     * 
     *         Returns the URL at which the report file can be downloaded.
     *         <p>
     *         The report will be generated as a gzip archive, containing the report file itself.
     *         
     *         @param reportJobId the ID of the {@link ReportJob}
     *         @param exportFormat the {@link ExportFormat} for the report file
     *         @return the URL for report file download
     *       
     * 
     * @param reportJobId
     * @param exportFormat
     * @return
     *     returns java.lang.String
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
    @RequestWrapper(localName = "getReportDownloadURL", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505", className = "com.google.api.ads.dfp.jaxws.v201505.ReportServiceInterfacegetReportDownloadURL")
    @ResponseWrapper(localName = "getReportDownloadURLResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505", className = "com.google.api.ads.dfp.jaxws.v201505.ReportServiceInterfacegetReportDownloadURLResponse")
    public String getReportDownloadURL(
        @WebParam(name = "reportJobId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
        Long reportJobId,
        @WebParam(name = "exportFormat", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
        ExportFormat exportFormat)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the URL at which the report file can be downloaded, and allows for customization
     *         of the downloaded report.
     *         <p>
     *         By default, the report will be generated as a gzip archive, containing the report file itself.
     *         This can be changed by setting {@link ReportDownloadOptions#useGzipCompression} to false.
     *         
     *         @param reportJobId the ID of the {@link ReportJob}
     *         @param reportDownloadOptions the {@link ReportDownloadOptions} for the request
     *         @return the URL for report file download
     *       
     * 
     * @param reportDownloadOptions
     * @param reportJobId
     * @return
     *     returns java.lang.String
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
    @RequestWrapper(localName = "getReportDownloadUrlWithOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505", className = "com.google.api.ads.dfp.jaxws.v201505.ReportServiceInterfacegetReportDownloadUrlWithOptions")
    @ResponseWrapper(localName = "getReportDownloadUrlWithOptionsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505", className = "com.google.api.ads.dfp.jaxws.v201505.ReportServiceInterfacegetReportDownloadUrlWithOptionsResponse")
    public String getReportDownloadUrlWithOptions(
        @WebParam(name = "reportJobId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
        Long reportJobId,
        @WebParam(name = "reportDownloadOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
        ReportDownloadOptions reportDownloadOptions)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the {@link ReportJobStatus} of the report job with the specified ID.
     *       
     * 
     * @param reportJobId
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201505.ReportJobStatus
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
    @RequestWrapper(localName = "getReportJobStatus", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505", className = "com.google.api.ads.dfp.jaxws.v201505.ReportServiceInterfacegetReportJobStatus")
    @ResponseWrapper(localName = "getReportJobStatusResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505", className = "com.google.api.ads.dfp.jaxws.v201505.ReportServiceInterfacegetReportJobStatusResponse")
    public ReportJobStatus getReportJobStatus(
        @WebParam(name = "reportJobId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
        Long reportJobId)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Initiates the execution of a {@link ReportQuery} on the server.
     *         
     *         <p>The following fields are required:
     *         <ul>
     *         <li>{@link ReportJob#reportQuery}</li>
     *         </ul>
     *         
     *         @param reportJob the report job to run
     *         @return the report job with its ID filled in
     *       
     * 
     * @param reportJob
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201505.ReportJob
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
    @RequestWrapper(localName = "runReportJob", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505", className = "com.google.api.ads.dfp.jaxws.v201505.ReportServiceInterfacerunReportJob")
    @ResponseWrapper(localName = "runReportJobResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505", className = "com.google.api.ads.dfp.jaxws.v201505.ReportServiceInterfacerunReportJobResponse")
    public ReportJob runReportJob(
        @WebParam(name = "reportJob", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
        ReportJob reportJob)
        throws ApiException_Exception
    ;

}