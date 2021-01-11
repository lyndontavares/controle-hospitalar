import http from "../http-common";

class TutorialDataService {
  getAll() {
    return http.get("/medicos");
  }

  get(id) {
    return http.get(`/medicos/${id}`);
  }

  create(data) {
    return http.post("/medicos", data);
  }

  update(id, data) {
    return http.put(`/medicos/${id}`, data);
  }

  delete(id) {
    return http.delete(`/medicos/${id}`);
  }

  deleteAll() {
    return http.delete(`/medicos`);
  }

  findByTitle(title) {
    return http.get(`/medicos?title=${title}`);
  }
}

export default new TutorialDataService();
