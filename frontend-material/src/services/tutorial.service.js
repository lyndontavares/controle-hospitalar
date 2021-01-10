import http from "../http-common";

class TutorialDataService {
  getAll() {
    return http.get("/api/medicos");
  }

  get(id) {
    return http.get(`/api/medicos/${id}`);
  }

  create(data) {
    return http.post("/api/medicos", data);
  }

  update(id, data) {
    return http.put(`/api/medicos/${id}`, data);
  }

  delete(id) {
    return http.delete(`/api/medicos/${id}`);
  }

  deleteAll() {
    return http.delete(`/api/medicos`);
  }

  findByTitle(title) {
    return http.get(`/api/medicos?title=${title}`);
  }
}

export default new TutorialDataService();
