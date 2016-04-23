install.packages("data.table")

library(data.table)

#Berechnen der Fehler - Funktionen

ape <- function (simulated,measured){return(abs(simulated-measured)/measured)}

error <- function (simulated,measured) { return(ape(mean(simulated),mean(measured)) * 100) }

#Berechnen der Fehler mit Adressen - Funktionen

compare <- function (measured.address, measured.csv, simulated.address, simulated.csv) {
    
    #Adresse der Simulations- und Messdaten
    
    measured.data.address <- file.path(measured.address, measured.csv);
    simulated.data.address <- file.path(simulated.address, simulated.csv);
    
    #Einlesen der Daten
    
    measured.data <- read.csv(measured.data.address, header=TRUE,sep=";");
    simulated.data <- read.csv(simulated.data.address, header=TRUE,sep=";");
    
    measured.data <- measured.data$Time.Span;
    simulated.data <- simulated.data$Time.Span;
    
    #Fehlerberechnung
    
    result <- data.table(mean(measured.data), mean(simulated.data), sd(measured.data), sd(simulated.data), error(simulated.data,measured.data));
    setnames(result, c("mean measured RT", "mean simulated RT", "measured standard deviation", "simulated standard deviation", "error"));
    
    return(result);
}

# Aufruf-Beispiel

# measured.address<-"/Nutshell/DesignDecisions/ComponentAlternative/"
# measured.csv<-"Response Time of Call_download4 (Lambda3).csv"
# simulated.address<-"/Nutshell/DesignDecisions/ReAllocationReEncoding/"
# simulated.csv<-"Response Time of Call_download4_ReAllocation (Lambda3) 2nd.csv"

# result <- compare(initial.architecture.simulated.address, initial.architecture.simulated.csv, design.decision.architecture.simulated.address, design.decision.architecture.simulated.csv)

# result

# Je nachdem wie Messergebnisse aussehen, sollte man das Einlesen anpassen, also folgende Zeile in compare-Funktion ersetzen:

# measured.data <- measured.data$Time.Span;


# batch Fehlerberechnung
dirs <- list.dirs(path="C:/Temp/data evaluation comparison", recursive=FALSE)
dirs <- list.dirs(dirs, recursive=FALSE)
measured.csv <- "meas.csv"
simulated.csv <- "sim.csv"
for (i in 1:length(dirs)) {
	dir <- dirs[i]
	result <- compare(dir, measured.csv, dir, simulated.csv)
	outputfile <- file.path(dir, "error.txt")
	write.table(file=outputfile, t(result), sep=": ", eol="\n")
}
